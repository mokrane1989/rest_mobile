package dz.mesrs.progres.rest.controler.lmd;

import com.github.dozermapper.core.Mapper;
import dz.mesrs.progres.rest.dto.lmd.PeriodeDto;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import dz.mesrs.progres.rest.repository.PeriodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 03/12/2021.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("api/infos")
public class PeriodeRestControler {

    @Autowired
    PeriodeRepository periodeRepository;


    @Autowired
    Mapper mapper;




    @GetMapping("/niveau/{idNiveau}/periodes")
    public @ResponseBody
    List<PeriodeDto> getBilanPeriode(@PathVariable Integer idNiveau) {
        List<Periode> periodes= periodeRepository.findAllByNiveau_idOrderByRang(idNiveau);


        if(periodes !=null && !periodes.isEmpty()) {
            List<PeriodeDto> list=new ArrayList<>();
            for(Periode periode:periodes) {
                PeriodeDto dto = mapper.map(periode, PeriodeDto.class);
                list.add(dto);
            }
            return list;

        }
        return null;
    }
}
