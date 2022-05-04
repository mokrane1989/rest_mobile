package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 05/08/2021.
 */


@RepositoryRestResource(collectionResourceRel = "dia", path = "dia")
public interface DossierInscriptionAdministrativeRepository
        extends JpaRepository<DossierInscriptionAdministrative, Long> {
    List<DossierInscriptionAdministrative> findById(Long id,Pageable page);

    List<DossierInscriptionAdministrative> findByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeOrderByAnneeAcademique_premiereAnneeDesc(String anneeBac, String matricule);
    Optional<DossierInscriptionAdministrative> findFirstByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeAndAnneeAcademique_id(String anneeBac, String matricule, Integer idAnneAcademique);

/*    default    Optional<DossierInscriptionAdministrative> shortmethName(String anneeBac, String matricule, Integer idAnneAcademique) {
        return findFirstByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeAndAnneeAcademique_id( anneeBac,  matricule,  idAnneAcademique);
    }*/

}

