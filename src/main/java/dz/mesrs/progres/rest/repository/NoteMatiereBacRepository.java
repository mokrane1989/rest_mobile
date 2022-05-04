package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.cursus.NoteMatiereBac;
import dz.mesrs.progres.rest.modal.NoteMatiereBacPk;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by k.kezzar on 28/10/2021.
 */
@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "bac", path = "note")
public interface NoteMatiereBacRepository  extends PagingAndSortingRepository<NoteMatiereBac, NoteMatiereBacPk> {
    List<NoteMatiereBac> findByAnneeBacAndDossierBachelier_Matricule(String anneeBac, String matricule);
}
