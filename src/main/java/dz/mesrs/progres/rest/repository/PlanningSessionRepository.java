package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.PlanningSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
public interface PlanningSessionRepository
extends JpaRepository<PlanningSession,Long> {
    List<PlanningSession> findByOuvertureOffreFormation_id(Integer idOof);
    List<PlanningSession> findByOuvertureOffreFormation_idAndPeriode_id(Integer idOof,Integer idPeriode);
    List<PlanningSession> findByOuvertureOffreFormation_idAndNiveau_id(Integer idOof,Integer niveau);
}
