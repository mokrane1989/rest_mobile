package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.conge.CongeAcademique;
import dz.mesrs.progres.rest.modal.dette.Dette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by m.bahmed on 19/04/2022.
 */
@Repository
public interface DetteRepository
extends JpaRepository<Dette,Long> {

}
