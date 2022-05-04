package dz.mesrs.progres.rest.modal.cursus;

/**
 * Created by k.kezzar on 28/10/2021.
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.NoteMatiereBacPk;
import dz.mesrs.progres.rest.modal.cursus.DossierBachelier;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name = "note_matiere_bac", schema = "bac")
@IdClass(NoteMatiereBacPk.class)
public class NoteMatiereBac implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Column(name = "ref_code_matiere", nullable = false)
    @Id
    private String refCodeMatiere;
    @Getter
    @Column(name = "annee_bac", length = 4, nullable = false,insertable = false,updatable = false)
    @Id
    private String anneeBac;
    @Getter
    @Column(name = "note", nullable = false, precision = 17, scale = 17)
    private Double note;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "matricule_bachelier", nullable = false, referencedColumnName = "matricule"),
            @JoinColumn(name = "annee_bac", nullable = false, referencedColumnName = "annee_bac") })
    @Id
    @Getter(onMethod_ = @JsonIgnore)
    private DossierBachelier dossierBachelier;

}