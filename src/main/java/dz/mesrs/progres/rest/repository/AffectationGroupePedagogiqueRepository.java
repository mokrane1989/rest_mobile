package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.groupe.AffectationGroupePedagogique;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
@ComponentScan
public interface AffectationGroupePedagogiqueRepository
extends JpaRepository<AffectationGroupePedagogique,Long> {
    List<AffectationGroupePedagogique> findByDossierInscriptionAdministrative_id(Long idDia);
}
