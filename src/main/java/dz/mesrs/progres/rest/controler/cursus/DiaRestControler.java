package dz.mesrs.progres.rest.controler.cursus;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.cursus.DossierInscriptionAdministrativeDto;
import dz.mesrs.progres.rest.modal.cursus.DossierEtudiant;
import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import dz.mesrs.progres.rest.modal.ppm.RefIndividu;
import dz.mesrs.progres.rest.repository.DossierEtudiantRepository;
import dz.mesrs.progres.rest.repository.DossierInscriptionAdministrativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 03/12/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class DiaRestControler {


    @Autowired
    Mapper mapper;

    @Autowired
    DossierInscriptionAdministrativeRepository diaRepository;

    @Autowired
    DossierEtudiantRepository dossierEtudiantRepository;



    @GetMapping("/sss/{idDia}")
    public @ResponseBody
    DossierInscriptionAdministrativeDto getDiaAnneeEncourddds(@PathVariable Long idDia) {
        Optional<DossierInscriptionAdministrative> dia = diaRepository.findById(idDia);
        if(dia.isPresent()) {
            DossierInscriptionAdministrativeDto dto = mapper.map(dia.get(), DossierInscriptionAdministrativeDto.class);
            return dto;
        }
        return null;

    }


    // http://192.168.40.66:8081/api/infos/bac/2016/37049153/dias
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/dias")
    public @ResponseBody
    List<DossierInscriptionAdministrativeDto> getDiass(@PathVariable String anneeBac, @PathVariable String matriculeBac) {
        List<DossierInscriptionAdministrative> dias = diaRepository.findByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeOrderByAnneeAcademique_premiereAnneeDesc(anneeBac, matriculeBac);
        if(dias!=null && !dias.isEmpty()) {
        List<DossierInscriptionAdministrativeDto> list=new ArrayList<>();
        for (DossierInscriptionAdministrative c:dias){
            try {
                list.add( mapper.map(c, DossierInscriptionAdministrativeDto.class));
            }catch (Exception ex){
            }

        }
        return list;
        }
        return null;

    }





   // http://192.168.40.66:8081/api/infos/bac/2016/37049153/anneeAcademique/16/dia
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/anneeAcademique/{idAnneeAcademiqe}/dia")
    public @ResponseBody
    Object getDiaAnneeEncours(@PathVariable String anneeBac, @PathVariable String matriculeBac,@PathVariable Integer idAnneeAcademiqe) {
        Optional<DossierInscriptionAdministrative> dia = diaRepository.findFirstByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeAndAnneeAcademique_id(anneeBac, matriculeBac, idAnneeAcademiqe);
     if(dia.isPresent()){
         DossierInscriptionAdministrative dossierInscriptionAdministrative = dia.get();

     return mapper.map(dossierInscriptionAdministrative,DossierInscriptionAdministrativeDto.class);
     }
       return null;

    }


// http://192.168.40.66:8081/api/infos/bac/2016/37049153/individu
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/individu")
    public @ResponseBody
    RefIndividu getIndividu(@PathVariable String anneeBac, @PathVariable String matriculeBac) {
        Optional<DossierEtudiant> de = dossierEtudiantRepository.findFirstByDossierBachelier_AnneeBacAndDossierBachelier_Matricule(anneeBac, matriculeBac);
        if (de.isPresent())
            return de.get().getIndividu();
        return null;
    }



}
