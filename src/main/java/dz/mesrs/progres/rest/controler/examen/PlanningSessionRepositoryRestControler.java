package dz.mesrs.progres.rest.controler.examen;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.examen.ExamenSessionDto;
import dz.mesrs.progres.rest.dto.examen.PlanningSessionDto;
import dz.mesrs.progres.rest.modal.examen.ExamenSession;
import dz.mesrs.progres.rest.modal.examen.PlanningSession;
import dz.mesrs.progres.rest.repository.ExamenSessionRepository;
import dz.mesrs.progres.rest.repository.PlanningSessionRepository;
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
public class PlanningSessionRepositoryRestControler {

    @Autowired
    PlanningSessionRepository planningSessionRepository;
    @Autowired
    ExamenSessionRepository examenSessionRepository;

    @Autowired
    Mapper mapper;


    @GetMapping("/offreFormation/{idOof}/niveau/{niveau}/planningExamens")
    public @ResponseBody
    List<PlanningSessionDto> getByIdOof(@PathVariable Integer idOof, @PathVariable Integer niveau) {
        List<PlanningSession> plannings= planningSessionRepository.findByOuvertureOffreFormation_idAndNiveau_id(idOof,niveau);
        if (plannings != null && !plannings.isEmpty()) {
            List<PlanningSessionDto> list = new ArrayList<>();
            for (PlanningSession planning : plannings) {

                list.add( mapper.map(planning, PlanningSessionDto.class));
            }
            return list;
        }
        return null;
    }
    @GetMapping("/offreFormation/{idOof}/periode/periode/{periode}/planningExamens")
    public @ResponseBody
    List<PlanningSessionDto> getByOofAndPeriode(@PathVariable Integer idOof,@PathVariable Integer periode) {
        List<PlanningSession> plannings= planningSessionRepository.findByOuvertureOffreFormation_idAndPeriode_id(idOof,periode);


        if (plannings != null && !plannings.isEmpty()) {
            List<PlanningSessionDto> list = new ArrayList<>();
            for (PlanningSession planning : plannings) {
               // PlanningSessionDto dto = mapper.map(planning, PlanningSessionDto.class);
                list.add(mapper.map(planning, PlanningSessionDto.class));

            }
            return list;
        }
        return null;
    }

    @GetMapping("/planningSession/{idPlanning}/examens")
    public @ResponseBody
    List<ExamenSession> getByPlanningId(@PathVariable Long idPlanning) {
        return examenSessionRepository.findByPlanningSession_id(idPlanning);
    }

    //39900
    @GetMapping("/Examens/{idOOf}/niveau/{idNiveau}/examens")
    public @ResponseBody
    List<ExamenSessionDto> getExamenByIdOOf(@PathVariable Integer idOOf,@PathVariable Integer idNiveau) {
        List<ExamenSession> examens = examenSessionRepository.findByPlanningSession_OuvertureOffreFormation_idAndPlanningSession_Periode_Niveau_id(idOOf,idNiveau);
List<ExamenSessionDto> list=new ArrayList<>();

        for (ExamenSession exame : examens) {
            // PlanningSessionDto dto = mapper.map(planning, PlanningSessionDto.class);
            list.add(mapper.map(exame, ExamenSessionDto.class));

        }
        return list;
    }
}


