package dz.mesrs.progres.rest.modal;

/**
 * Created by k.kezzar on 28/10/2021.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.cursus.DossierBachelier;
import lombok.Data;

@Data
public class NoteMatiereBacPk implements java.io.Serializable {

    private String refCodeMatiere;
    private String anneeBac;
    @JsonIgnore
    private DossierBachelier dossierBachelier;

}