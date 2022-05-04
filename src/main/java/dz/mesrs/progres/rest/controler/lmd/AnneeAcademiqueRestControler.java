package dz.mesrs.progres.rest.controler.lmd;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.lmd.AnneeAcademiqueDto;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import dz.mesrs.progres.rest.repository.AnneeAcademiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by k.kezzar on 09/11/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class AnneeAcademiqueRestControler {

    @Autowired
    AnneeAcademiqueRepository anneeAcademiqueRepository;

    @Autowired
    Mapper mapper;

    @GetMapping("/AnneeAcademiqueList")
    public @ResponseBody
    List<AnneeAcademiqueDto> getAnneeAcademiqueList() {

         List<AnneeAcademique> academiques = anneeAcademiqueRepository.findAll();
        if(academiques !=null && !academiques.isEmpty()) {
            List<AnneeAcademiqueDto> list=new ArrayList<>();
            for(AnneeAcademique annee:academiques) {
                AnneeAcademiqueDto dto = mapper.map(annee, AnneeAcademiqueDto.class);
                list.add(dto);
            }
            return list;

        }
        return null;
    }

    @GetMapping("/AnneeAcademiqueEncours")
    public @ResponseBody
    AnneeAcademiqueDto getAnneeAcademiqueEncours() {
        Optional<AnneeAcademique> anneeAcademiques = anneeAcademiqueRepository.findFistByEstAnneeAcademiqueEncours(true);
        if (anneeAcademiques.isPresent()) {
            AnneeAcademique anneeAcademique = anneeAcademiques.get();
            AnneeAcademiqueDto dto = mapper.map(anneeAcademique, AnneeAcademiqueDto.class);
            return dto;
        }
        return null;
    }
}
