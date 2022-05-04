package dz.mesrs.progres.rest.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by k.kezzar on 22/03/2022.
 */
@CrossOrigin(origins = "*")
@RestController
public class TestRestControler {

    @RequestMapping(value = {"/api/authentication/test"}, method = RequestMethod.GET)
    public ResponseEntity<?> test() throws Exception {
        return ResponseEntity.ok("test");
    }
}
