package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 09/11/2021.
 */

public interface AnneeAcademiqueRepository extends JpaRepository<AnneeAcademique,Integer> {
    Optional<AnneeAcademique> findFistByEstAnneeAcademiqueEncours(Boolean estAnneeEncours);
}
