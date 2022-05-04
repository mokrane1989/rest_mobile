package dz.mesrs.progres.rest.controler.examen;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.examen.EvaluationControleContinuDto;
import dz.mesrs.progres.rest.dto.examen.NoteEvaluationControleContinuDto;
import dz.mesrs.progres.rest.modal.examen.EvaluationControleContinu;
import dz.mesrs.progres.rest.modal.examen.NoteEvaluationControleContinu;
import dz.mesrs.progres.rest.repository.EvaluationControleContinuRespository;
import dz.mesrs.progres.rest.repository.NoteEvaluationControleContinuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 16/11/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class EvaluationControleContinuRestController {

    @Autowired
    EvaluationControleContinuRespository ccRepository;
    @Autowired
    NoteEvaluationControleContinuRepository noteCcRepository;

    @Autowired
    Mapper mapper;

    @GetMapping("/groupePedagogique/{idGroupePedagogique}/controleContinue")
    public   @ResponseBody
    List<EvaluationControleContinuDto> findControleContinuByGroupeId(@PathVariable Long idGroupePedagogique) {
        List<EvaluationControleContinu> controleContinuList = ccRepository.findAllByAssociationGroupePedagogique_GroupePedagogique_id(idGroupePedagogique);

        if (controleContinuList != null && !controleContinuList.isEmpty()) {
            List<EvaluationControleContinuDto> list = new ArrayList<>();
            for (EvaluationControleContinu cc : controleContinuList) {
                EvaluationControleContinuDto dto = mapper.map(cc, EvaluationControleContinuDto.class);
                list.add(dto);

            }
            return list;
        }
        return null;
    }


    @GetMapping("/controleContinue/dia/{idDia}/periode/{idPeriode}/notesCC")
    public   @ResponseBody
    List<NoteEvaluationControleContinuDto> findNoteControleContinuByidDaiIdPeiorde(@PathVariable Long idDia, @PathVariable Integer idPeriode ){
        List<NoteEvaluationControleContinu> notes= noteCcRepository.findAllByAffectationGroupePedagogique_DossierInscriptionAdministrative_idAndAffectationGroupePedagogique_GroupePedagogique_Periode_id(idDia,idPeriode);
        if (notes != null && !notes.isEmpty()) {
            List<NoteEvaluationControleContinuDto> list = new ArrayList<>();
            for (NoteEvaluationControleContinu note : notes) {
                NoteEvaluationControleContinuDto dto = mapper.map(note, NoteEvaluationControleContinuDto.class);
                list.add(dto);

            }
            return list;
        }
        return null;
    }

    @GetMapping("/controleContinue/dia/{idDia}/notesCC")
    public   @ResponseBody
    List<NoteEvaluationControleContinuDto> findNoteControleContinuByidDai(@PathVariable Long idDia){
        List<NoteEvaluationControleContinu> notes= noteCcRepository.findAllByAffectationGroupePedagogique_DossierInscriptionAdministrative_id(idDia);
        if (notes != null && !notes.isEmpty()) {
            List<NoteEvaluationControleContinuDto> list = new ArrayList<>();
            for (NoteEvaluationControleContinu note : notes) {
                list.add(   mapper.map(note, NoteEvaluationControleContinuDto.class));

            }
            return list;
        }
        return null;
    }



}
