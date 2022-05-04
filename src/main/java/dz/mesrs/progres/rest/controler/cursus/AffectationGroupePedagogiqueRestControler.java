package dz.mesrs.progres.rest.controler.cursus;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.cursus.AffectationGroupePedagogiqueDto;
import dz.mesrs.progres.rest.modal.groupe.AffectationGroupePedagogique;
import dz.mesrs.progres.rest.repository.AffectationGroupePedagogiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 09/11/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class AffectationGroupePedagogiqueRestControler {

    @Autowired
    Mapper mapper;
    @Autowired
    AffectationGroupePedagogiqueRepository affectationGroupePedagogiqueRepository;

    //@GetMapping("/affectationGP/{idDia}")
    @GetMapping("/dia/{idDia}/groups")
    public @ResponseBody
    List<AffectationGroupePedagogiqueDto> getAffecfationByIdDia(@PathVariable Long idDia) {

        List<AffectationGroupePedagogique> affectations = affectationGroupePedagogiqueRepository.findByDossierInscriptionAdministrative_id(idDia);
        if (affectations != null && !affectations.isEmpty()) {
            List<AffectationGroupePedagogiqueDto> list = new ArrayList<>();
            for (AffectationGroupePedagogique affectation : affectations) {
               // AffectationGroupePedagogiqueDto dto = mapper.map(affectation, AffectationGroupePedagogiqueDto.class);
                list.add(mapper.map(affectation, AffectationGroupePedagogiqueDto.class));
            }
            return list;
        }
        return null;
    }

}