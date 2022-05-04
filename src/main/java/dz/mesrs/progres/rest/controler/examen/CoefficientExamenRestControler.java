package dz.mesrs.progres.rest.controler.examen;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.examen.CoefficientExamenDto;
import dz.mesrs.progres.rest.modal.examen.CoefficientExamen;
import dz.mesrs.progres.rest.repository.CoefficientExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 06/12/2021.
 */

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class CoefficientExamenRestControler {



    @Autowired
    CoefficientExamenRepository coefficientExamenRepository;

    @Autowired
    Mapper mapper;

    @GetMapping("/offreFormation/{idOof}/niveau/{idNiveau}/Coefficients")
    public @ResponseBody
    List<CoefficientExamenDto> getCoefficentExamen(@PathVariable Integer idOof,@PathVariable Integer idNiveau) {
        List<CoefficientExamen> coefficients = coefficientExamenRepository.findByOuvertureOffreFormation_idAndPeriode_Niveau_id(idOof,idNiveau);
        //List<CoefficientExamen> coefficients = coefficientExamenRepository.findByOofAndNiveau(idOof,idNiveau);

        if (coefficients != null && !coefficients.isEmpty()) {
            List<CoefficientExamenDto> list = new ArrayList<>();
            for (CoefficientExamen coefficient : coefficients) {
                list.add(mapper.map(coefficient, CoefficientExamenDto.class));
            }
            return list;
        }
        return null;
    }

}
