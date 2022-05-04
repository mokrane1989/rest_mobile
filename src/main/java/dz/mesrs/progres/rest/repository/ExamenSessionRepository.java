package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.ExamenSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
public interface ExamenSessionRepository  extends
        JpaRepository<ExamenSession,Long> {
    List<ExamenSession> findByPlanningSession_OuvertureOffreFormation_id(Integer idOof);
    List<ExamenSession> findByPlanningSession_OuvertureOffreFormation_idAndPlanningSession_Periode_Niveau_id(Integer idOof,Integer idNiveau);
    List<ExamenSession> findByPlanningSession_id(Long idPlanning);
}
