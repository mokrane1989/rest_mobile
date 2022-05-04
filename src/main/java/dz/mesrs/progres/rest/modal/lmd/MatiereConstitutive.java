package dz.mesrs.progres.rest.modal.lmd;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Table(name = "mc", schema = "lmd")
public class MatiereConstitutive implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "code", unique = true, nullable = false, length = 50)
    private String code;
    @Column(name = "libelle_fr", nullable = false, length = 150)
    private String libelleFr;
    @Column(name = "libelle_ar", length = 150)
    private String libelleAr;



}