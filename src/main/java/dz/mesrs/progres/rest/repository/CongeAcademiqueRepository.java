package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.conge.CongeAcademique;
import dz.mesrs.progres.rest.modal.examen.PlanningSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by m.bahmed on 19/04/2022.
 */
@Repository
public interface CongeAcademiqueRepository
extends JpaRepository<CongeAcademique,Long> {

    //List<CongeAcademique> findByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeOrderByAnneeAcademique_premiereAnneeDesc(String anneeBac, String matricule);
    CongeAcademique findByDossierInscriptionAdministrative_Id(long id);
    //Optional<CongeAcademique> findFirstByDossierEtudiant_DossierBachelier_AnneeBacAndDossierEtudiant_DossierBachelier_MatriculeAndAnneeAcademique_id(String anneeBac, String matricule, Integer idAnneAcademique);

}
