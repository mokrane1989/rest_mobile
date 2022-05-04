package dz.mesrs.progres.rest.controler.examen;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.examen.ExamenSessionDto;
import dz.mesrs.progres.rest.dto.examen.InscriptionExamenDto;
import dz.mesrs.progres.rest.modal.examen.ExamenSession;
import dz.mesrs.progres.rest.modal.examen.InscriptionExamen;
import dz.mesrs.progres.rest.repository.ExamenSessionRepository;
import dz.mesrs.progres.rest.repository.InscriptionExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class InscriptionExamenRestControler {
    @Autowired
    InscriptionExamenRepository inscriptionExamenRepository;
    @Autowired
    ExamenSessionRepository examenSessionRepository;
    @Autowired
    Mapper mapper;



    //@GetMapping("/NoteExamens/{idDia}")
    @GetMapping("/planningSession/{idPlanningSession}/dia/{idDia}/noteExamens")
    public @ResponseBody
    List<InscriptionExamenDto>  getExamensByIdDia(@PathVariable Long idPlanningSession, @PathVariable Long idDia) {
        List<InscriptionExamen> examens= inscriptionExamenRepository.findByExamenSession_PlanningSession_idAndDossierInscriptionAdministrative_id(idPlanningSession,idDia);
        if (examens != null && !examens.isEmpty()) {
            List<InscriptionExamenDto> list = new ArrayList<>();
            for (InscriptionExamen examen : examens) {
                //InscriptionExamenDto dto = mapper.map(examen, InscriptionExamenDto.class);
                list.add(mapper.map(examen, InscriptionExamenDto.class));

            }
            return list;
        }
        return null;

    }@GetMapping("/planningSession/dia/{idDia}/noteExamens")
    public @ResponseBody
    List<InscriptionExamenDto>  getExamensByDias( @PathVariable Long idDia) {
        List<InscriptionExamen> examens= inscriptionExamenRepository.findByDossierInscriptionAdministrative_id(idDia);
        if (examens != null && !examens.isEmpty()) {
            List<InscriptionExamenDto> list = new ArrayList<>();
            for (InscriptionExamen examen : examens) {
                //InscriptionExamenDto dto = mapper.map(examen, InscriptionExamenDto.class);
                list.add(mapper.map(examen, InscriptionExamenDto.class));

            }
            return list;
        }
        return null;

    }
    @GetMapping("/offreFormation/{idOof}/examans")
    public @ResponseBody
    List<ExamenSessionDto>  getExamensByIdOof(@PathVariable Integer idOof) {
        List<ExamenSession> examens=  examenSessionRepository.findByPlanningSession_OuvertureOffreFormation_id(idOof);

        if (examens != null && !examens.isEmpty()) {
            List<ExamenSessionDto> list = new ArrayList<>();
            for (ExamenSession examen : examens) {
                ExamenSessionDto dto = mapper.map(examen, ExamenSessionDto.class);
                list.add(dto);

            }
            return list;
        }
        return null;
    }
}
