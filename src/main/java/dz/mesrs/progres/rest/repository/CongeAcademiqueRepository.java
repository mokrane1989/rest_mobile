package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.conge.CongeAcademique;
import dz.mesrs.progres.rest.modal.examen.PlanningSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by m.bahmed on 19/04/2022.
 */
@Repository
public interface CongeAcademiqueRepository
extends JpaRepository<CongeAcademique,Long> {

}
