package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.BilanSession;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 05/08/2021.
 */
@RepositoryRestResource(collectionResourceRel = "bilan", path = "bilan")
public interface BilanSessionRepository extends PagingAndSortingRepository<BilanSession,Long> {
   List<BilanSession> findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_Matricule(String anneeBac, String matricule);
   List<BilanSession> findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_MatriculeAndPeriode_Niveau_Code(String anneeBac, String matricule,String niveau);
   //@QueryByMethodName("findOneByDeletedIsFalseAndEmail")
   List<BilanSession> findByDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_AnneeBacAndDossierInscriptionAdministrative_DossierEtudiant_DossierBachelier_MatriculeAndPeriode_Code(String anneeBac, String matricule,String periode);
   List<BilanSession> findFistByDossierInscriptionAdministrative_IdAndAnnuel(Long idDia,Boolean isAnnuel);
   List<BilanSession> findByDossierInscriptionAdministrative_IdAndAnnuel(Long idDia,Boolean isAnnuel);
   Optional<BilanSession> findFirstByDossierInscriptionAdministrative_IdAndPeriode_idAndAnnuel(Long idDia, Long idPeriode, Boolean isAnnuel);


}
