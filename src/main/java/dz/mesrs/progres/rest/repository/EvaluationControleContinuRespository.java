package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.EvaluationControleContinu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 16/11/2021.
 */
public interface EvaluationControleContinuRespository extends JpaRepository<EvaluationControleContinu,Long> {
List <EvaluationControleContinu> findAllByAssociationGroupePedagogique_GroupePedagogique_id(Long idGroupePedagogique);

}
