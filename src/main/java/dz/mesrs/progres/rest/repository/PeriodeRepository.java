package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.lmd.Periode;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by k.kezzar on 07/11/2021.
 */
@Repository
public interface PeriodeRepository extends CrudRepository<Periode,Integer >, JpaSpecificationExecutor<Periode> {
    List<Periode> findAllByNiveau_idOrderByRang(Integer idNiveau);
}
