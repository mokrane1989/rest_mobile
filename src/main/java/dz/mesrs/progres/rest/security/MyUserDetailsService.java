package dz.mesrs.progres.rest.security;

import dz.mesrs.progres.rest.modal.cursus.DossierBachelier;
import dz.mesrs.progres.rest.repository.DossierBachelierRepository;
import dz.mesrs.progres.rest.security.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k.kezzar on 26/02/2020.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

@Autowired
DossierBachelierRepository dossierBachlierRepository;
    @Override
    public MyUserDetail loadUserByUsername(String s) throws UsernameNotFoundException {

        List<DossierBachelier> dossierBacheliers = dossierBachlierRepository.findByMatricule(s);
if(dossierBacheliers!=null && !dossierBacheliers.isEmpty()) {
    DossierBachelier dossierBachelier = dossierBacheliers.get(0);
    MyUserDetail myUserDetail = new MyUserDetail(dossierBachelier.getMatricule()+dossierBachelier.getAnneeBac(), dossierBachelier.getAnneeBac(), new ArrayList<>());
    myUserDetail.setUserId(0);
    return myUserDetail;
}
throw new  UsernameNotFoundException("Mot de passe ou nom utilisateur incorrecte");

    }
    public MyUserDetail loadUserByMatriculeAndAnneeBac(String matricule,String anneeBac) throws UsernameNotFoundException {

        DossierBachelier dossierBachelier = dossierBachlierRepository.findOneByMatriculeAndAnneeBac(matricule, anneeBac);
        if(dossierBachelier!=null) {
            MyUserDetail myUserDetail = new MyUserDetail(dossierBachelier.getMatricule()+dossierBachelier.getAnneeBac(), dossierBachelier.getAnneeBac(), new ArrayList<>());
            myUserDetail.setUserId(0);
            return  myUserDetail;
        }
        throw new BadCredentialsException("Mot de passe ou nom utilisateur incorrecte");
    }
}
