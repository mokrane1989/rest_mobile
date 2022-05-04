package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.NoteEvaluationControleContinu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 16/11/2021.
 */
public interface NoteEvaluationControleContinuRepository  extends JpaRepository<NoteEvaluationControleContinu,Long> {
    List<NoteEvaluationControleContinu> findAllByAffectationGroupePedagogique_DossierInscriptionAdministrative_idAndAffectationGroupePedagogique_GroupePedagogique_Periode_id(Long idDia,Integer idPeriode);
    List<NoteEvaluationControleContinu> findAllByAffectationGroupePedagogique_DossierInscriptionAdministrative_id(Long idDia);
}
