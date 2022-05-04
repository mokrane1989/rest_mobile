package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.cursus.DossierBachelier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 05/08/2021.
 */
@RepositoryRestResource(collectionResourceRel = "bac", path = "bac")
public interface DossierBachelierRepository  extends PagingAndSortingRepository<DossierBachelier,Long> {
    Optional<DossierBachelier> findFirstByAnneeBacAndMatricule(String anneeBac, String matricule);
    List<DossierBachelier> findAllByAnneeBac(String anneeBac);

    @Query(value = "SELECT distinct db.* FROM bac.dossier_bachelier db\n" +
            "inner join cursus.dossier_etudiant de on de.id_dossier_bachelier=db.id\n" +
            "inner join cursus.dossier_inscription_administrative dia on dia.id_dossier_etudiant=de.id \n" +
            "where concat(matricule,annee_bac)=?",
            nativeQuery = true)
    List<DossierBachelier> findByMatricule(String matricule);
    DossierBachelier findOneByMatriculeAndAnneeBac(String matricule,String anneeBac);
}
