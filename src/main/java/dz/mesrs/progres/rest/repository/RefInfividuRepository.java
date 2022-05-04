package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.ppm.RefIndividu;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by k.kezzar on 04/08/2021.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface RefInfividuRepository extends PagingAndSortingRepository<RefIndividu,Long> {
    List<RefIndividu>  findByNomLatinIgnoreCaseContaining(String nomLatin, Pageable pageable);
}
