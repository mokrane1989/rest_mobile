package dz.mesrs.progres.rest.repository;

import dz.mesrs.progres.rest.modal.examen.CoefficientExamen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by k.kezzar on 06/12/2021.
 */
public interface CoefficientExamenRepository extends CrudRepository<CoefficientExamen,Long> {
    List<CoefficientExamen> findByOuvertureOffreFormation_idAndPeriode_Niveau_id(Integer OofId,Integer idNiveau);

    @Query(value = "select ex.* from fve_examen.coefficient_examen ex\n" +
            "inner join lmd.periode p on p.id=ex.id_periode\n" +
            "where id_oof=? and p.id_niveau=?", nativeQuery = true)
    List<CoefficientExamen> findByOofAndNiveau(Integer OofId,Integer idNiveau);




}
