package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.InscriptionExamen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
public interface InscriptionExamenRepository
extends JpaRepository<InscriptionExamen,Long> {

    List<InscriptionExamen> findByExamenSession_PlanningSession_idAndDossierInscriptionAdministrative_id(Long idDia,long idPlanningSession);
    List<InscriptionExamen> findByDossierInscriptionAdministrative_id(Long idDia);

}
