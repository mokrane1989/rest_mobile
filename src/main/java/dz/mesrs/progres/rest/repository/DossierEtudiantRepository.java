package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.cursus.DossierEtudiant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 05/08/2021.
 */
@CrossOrigin(origins = "*")
public interface DossierEtudiantRepository extends PagingAndSortingRepository<DossierEtudiant,Long> {

    Optional<DossierEtudiant> findFirstByDossierBachelier_AnneeBacAndDossierBachelier_Matricule(String anneeBac, String matricule);
}
