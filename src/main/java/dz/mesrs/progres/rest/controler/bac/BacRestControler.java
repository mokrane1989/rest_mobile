package dz.mesrs.progres.rest.controler.bac;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.bac.DossierBachelierDto;
import dz.mesrs.progres.rest.dto.bac.NoteMatiereBacDto;
import dz.mesrs.progres.rest.modal.cursus.DossierBachelier;
import dz.mesrs.progres.rest.modal.cursus.DossierEtudiant;
import dz.mesrs.progres.rest.modal.cursus.NoteMatiereBac;
import dz.mesrs.progres.rest.repository.*;
import net.coobird.thumbnailator.Thumbnails;
import org.apache.commons.io.FileUtils;
import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

/**
 * Created by k.kezzar on 28/10/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class BacRestControler {

    @Autowired
    NoteMatiereBacRepository noteMatiereBacRepository;

    @Autowired
    DossierEtudiantRepository  dossierEtudiantRepository;

    @Autowired
    Mapper mapper;


    @Autowired
    DossierBachelierRepository dossierBachelierRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Value("${path.photo}")
    private String photoPath;
    @Value("${tmp.photo}")
    private String photoTmp;

    // http://192.168.40.66:8081/api/infos/bac/2016/37049153/notes
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/notes")
    public @ResponseBody
    List<NoteMatiereBacDto> getNotes(@PathVariable String anneeBac, @PathVariable String matriculeBac) {
        List<NoteMatiereBac> notes = noteMatiereBacRepository.findByAnneeBacAndDossierBachelier_Matricule(anneeBac, matriculeBac);
        if (notes != null && !notes.isEmpty()) {
            List<NoteMatiereBacDto> list = new ArrayList<>();
            for (NoteMatiereBac note : notes) {
                NoteMatiereBacDto dto = mapper.map(note, NoteMatiereBacDto.class);
                list.add(dto);
            }
            return list;
        }
        return new ArrayList<>();
    }

    // /api/infos/bac/2016/37049153/
    @GetMapping("/bac/{anneeBac}/{matriculeBac}")
    public @ResponseBody
    DossierBachelierDto getInfoBac(@PathVariable String anneeBac, @PathVariable String matriculeBac) {
        Optional<DossierBachelier> bac = dossierBachelierRepository.findFirstByAnneeBacAndMatricule(anneeBac, matriculeBac);
        if (bac.isPresent()) {
            DossierBachelierDto dto = mapper.map(bac.get(), DossierBachelierDto.class);
            return dto;
        }
        return null;
    }

    @GetMapping("/bac/{anneeBac}/")
    public @ResponseBody
    List<Object[]> getBacs(@PathVariable String anneeBac) {
        //  List<DossierBachelier> bacs = dossierBachelierRepository.findAllByAnneeBac(anneeBac);

        String query = "select concat ('[',id,',', matricule,',', nom_ar,',', prenom_ar,',', nom_fr,',', prenom_fr,',', date_naissance,',', prenom_pere,',', nom_prenom_mere,',', telephone,',', adresse_residence,',', ref_code_sexe,',', ref_code_wilaya_naissance,',', ref_code_wilaya_bac,',', ref_code_wilaya_residence,',', ref_code_serie_bac,',', libelle_ville_naissance,',', \n" +
                " libelle_serie_bac,',', moyenne_bac\n" +
                "\n" +
                ",',',  photo,',', annee_bac,',',  nin,']') as tt from bac.dossier_bachelier where annee_bac='2021' limit 10\n";

        String qq = "select db.id, matricule, nom_ar, prenom_ar, nom_fr, prenom_fr, date_naissance::text, prenom_pere, nom_prenom_mere, telephone, adresse_residence, ref_code_sexe, ref_code_wilaya_naissance, ref_code_wilaya_bac, ref_code_wilaya_residence, ref_code_serie_bac, libelle_ville_naissance, \n" +
                " libelle_serie_bac, moyenne_bac " +
                " from bac.dossier_bachelier db\n" +
                "inner join cursus.dossier_etudiant de on de.id_dossier_bachelier=db.id\n" +
                "inner join cursus.dossier_inscription_administrative dia on dia.id_dossier_etudiant=de.id and dia.id_etablissement=136950 ";
        /*List<String[]> query1 = jdbcTemplate.queryForList(qq,
                String[].class);*/


        List<Object[]> result = jdbcTemplate.queryForList(qq).stream().map(row -> row.values().toArray()).collect(Collectors.toList());

        return result;

    }





    @GetMapping(value="/bac/XXX/", produces = "application/zip")
    public ResponseEntity<ByteArrayResource> getBacsAA() throws IOException {


        String query = "select d.url from concours.compte_candidat cpt \n" +
                "inner join concours.document_cursus_candidat d on d.id_candidat=cpt.id_candidat\n" +
                "where cpt.token='fa6590a7-9bd3-45d9-b969-ea983a8d2332'";
        List<String> query1 = jdbcTemplate.queryForList(query,
                String.class);

        zipDirectory(query1);
        String zipDirName = "matricule" + ".zip";
        final ByteArrayResource inputStream = new ByteArrayResource(Files.readAllBytes(Paths.get(zipDirName)));
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentLength(inputStream.contentLength())
                .body(inputStream);

    }


    //@GetMapping("/periodesByIdNiveau/{idNiveau}")
    @GetMapping(value = "/image/{anneeBac}/{matricule}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    public ResponseEntity<String> image(@PathVariable("matricule") String matricule, @PathVariable("anneeBac") String anneeBac) throws IOException {
        Optional<DossierEtudiant> de = dossierEtudiantRepository.findFirstByDossierBachelier_AnneeBacAndDossierBachelier_Matricule(anneeBac, matricule);
          String uploadFile = photoPath+de.get().getIndividu().getPhoto();
          String targetFilePath = photoTmp+UUID.randomUUID() +".jpg";
        //String uploadFile = "C:\\Users\\USER\\Pictures\\img_avatar2.png";
        //String targetFilePath = "C:\\Users\\USER\\Pictures\\r"+ UUID.randomUUID() +".jpg";
        //String targetFilePath = "C:\\Users\\USER\\Pictures\\"+UUID.randomUUID() +".jpg";


        int targetSize = 200;
        resizeImage(uploadFile, targetFilePath, targetSize);
        byte[] file = Files.readAllBytes(Paths.get(targetFilePath));
        File fileDelete = new File(targetFilePath);
        String encodingFile = Base64.getEncoder().encodeToString(file);
        fileDelete.delete();
        System.out.println(encodingFile);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(encodingFile);

    }
 //   @GetMapping(value = "/image/{anneeBac}/{matricule}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
//    public ResponseEntity<String> image(@PathVariable("matricule") String matricule, @PathVariable("anneeBac") String anneeBac) throws IOException {
//        Optional<DossierEtudiant> de = dossierEtudiantRepository.findFirstByDossierBachelier_AnneeBacAndDossierBachelier_Matricule(anneeBac, matricule);
//          // String uploadFile = photoPath+de.get().getIndividu().getPhoto();
//        String uploadFile = "C:\\Users\\USER\\Pictures\\r.jpg";
//        String x = "C:\\Users\\USER\\Pictures\\r1.jpg";
//        ByteArrayOutputStream f = new ByteArrayOutputStream();
//        Thumbnails.of(uploadFile)
//                .size(120, 120)
//                .outputQuality(1)
//                .toFile(x);
//
//        byte[] file = Files.readAllBytes(Paths.get(x));
//
//        String encodingFile = Base64.getEncoder().encodeToString(file);
//        System.out.println(encodingFile);
//            return ResponseEntity
//                    .status(HttpStatus.OK)
//                    .body(encodingFile);
//
//
//    }

    public  void resizeImage(String originalFilePath, String targetFilePath, int targetSize) {
        try {
            File sourceFile = new File(originalFilePath);
            BufferedImage originalImage = ImageIO.read(sourceFile);

            BufferedImage resizedImage = Scalr.resize(originalImage, targetSize);

            File resizedFile = new File(targetFilePath);
            ImageIO.write(resizedImage, "jpg", resizedFile);

            originalImage.flush();
            resizedImage.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void zipDirectory(List<String> filesListInDir) {
        try {

            String zipDirName = "matricule" + ".zip";

            FileOutputStream fos = new FileOutputStream(zipDirName);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (String fileName : filesListInDir) {
                fileName="C:/mesrs/documents/upload"+fileName;
                File file = new File(fileName);
                ZipEntry ze = new ZipEntry(file.getName());
                try {
                    zos.putNextEntry(ze);
                } catch (ZipException e) {
                }

                //read the file and write to ZipOutputStream
                FileInputStream fis = new FileInputStream(fileName);
                byte[] buffer = new byte[2048];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }
                zos.closeEntry();
                fis.close();
            }
            zos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



