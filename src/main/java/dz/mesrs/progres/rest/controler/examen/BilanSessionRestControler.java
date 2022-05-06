package dz.mesrs.progres.rest.controler.examen;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.examen.BilanSessionDto;
import dz.mesrs.progres.rest.modal.examen.BilanSession;
import dz.mesrs.progres.rest.repository.BilanSessionRepository;
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
public class BilanSessionRestControler {

    @Autowired
    BilanSessionRepository bilanSessionRepository;

    @Autowired
    Mapper mapper;

    @GetMapping("/bac/{anneeBac}/{matriculeBac}/periode/{periode}/bilans")
    public @ResponseBody
    List<BilanSessionDto> getBilanPeriode(@PathVariable String anneeBac, @PathVariable String matriculeBac, @PathVariable String periode) {

        List<BilanSession> bilans = bilanSessionRepository.findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_MatriculeAndPeriode_Code(anneeBac, matriculeBac, periode);

        if (bilans != null && !bilans.isEmpty()) {
            List<BilanSessionDto> list = new ArrayList<>();
            for (BilanSession bilan : bilans) {
                BilanSessionDto dto = mapper.map(bilan, BilanSessionDto.class);
                list.add(dto);
            }
            return list;
        }
        return null;
    }


    @GetMapping("/bac/{anneeBac}/{matriculeBac}/dias/{idDia}/periode/bilans")
    public @ResponseBody
    List<BilanSessionDto> getBilanPeriodeByIdDia(@PathVariable Long idDia) {
        List<BilanSession> bilans = bilanSessionRepository.findByDossierInscriptionAdministrative_IdAndAnnuel(idDia, false);

        if (bilans != null && !bilans.isEmpty()){
            List<BilanSessionDto> list = new ArrayList<>();
            for (BilanSession bilan : bilans) {
                //BilanSessionDto dto = mapper.map(bilan, BilanSessionDto.class);
                list.add(mapper.map(bilan, BilanSessionDto.class));
            }
            return list;
        }
        return new ArrayList<>();
    }

    //@GetMapping("/bilanPeriodeByIdDia/{anneeBac}/{matriculeBac}/{idDia}/{idPeriode}")
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/dia/{idDia}/periode/{idPeriode}/bilan")
    public @ResponseBody
    Object getBilanPeriodeByIdDiaAndPeriode(@PathVariable Long idDia,@PathVariable Long idPeriode) {
        Optional<BilanSession> bilan = bilanSessionRepository.findFirstByDossierInscriptionAdministrative_IdAndPeriode_idAndAnnuel(idDia, idPeriode, false);
        if(bilan.isPresent()){
            mapper.map(bilan.get(),BilanSessionDto.class);
        }
        return null;

    }

    //@GetMapping("/bilanAnnuelByIdDia/{anneeBac}/{matriculeBac}/{idDia}/")
    @GetMapping("/bac/{anneeBac}/{matriculeBac}/dia/{idDia}/annuel/bilan")
    public @ResponseBody
    List<BilanSessionDto> getBilanAnnuelByIdDia(@PathVariable Long idDia) {
        List<BilanSession> bilans = bilanSessionRepository.findFistByDossierInscriptionAdministrative_IdAndAnnuel(idDia, true);

        if (bilans != null && !bilans.isEmpty()) {
            List<BilanSessionDto> list = new ArrayList<>();
            for (BilanSession bilan : bilans) {
                //BilanSessionDto dto = mapper.map(bilan, BilanSessionDto.class);
                list.add(mapper.map(bilan, BilanSessionDto.class));
            }
            return list;
        }

        return null;
    }

    @GetMapping("/bac/{anneeBac}/{matriculeBac}/bilans")
    public @ResponseBody
    List<BilanSessionDto> getBilanSession(@PathVariable String anneeBac, @PathVariable String matriculeBac) {
        List<BilanSession> bilans= bilanSessionRepository.findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_Matricule(anneeBac, matriculeBac);
        if (bilans != null && !bilans.isEmpty()) {
            List<BilanSessionDto> list = new ArrayList<>();
            for (BilanSession bilan : bilans) {
                list.add(mapper.map(bilan, BilanSessionDto.class));

            }
            return list;
        }
        return null;

    }


    @GetMapping("/bac/{anneeBac}/{matriculeBac}/niveau/{niveau}/bilans")
    public @ResponseBody
    List<BilanSessionDto> getBilanByNiveau(@PathVariable String anneeBac, @PathVariable String matriculeBac,@PathVariable String niveau) {
        List<BilanSession> bilans= bilanSessionRepository.findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_MatriculeAndPeriode_Niveau_Code(anneeBac, matriculeBac,niveau);
        if (bilans != null && !bilans.isEmpty()) {
            List<BilanSessionDto> list = new ArrayList<>();
            for (BilanSession bilan : bilans) {
                BilanSessionDto dto = mapper.map(bilan, BilanSessionDto.class);
                list.add(dto);
            }
            return list;
        }
        return null;
    }
}
