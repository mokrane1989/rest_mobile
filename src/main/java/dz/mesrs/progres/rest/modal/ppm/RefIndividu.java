package dz.mesrs.progres.rest.modal.ppm;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ref_individu", schema = "ppm")
public class RefIndividu {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "identifiant", nullable = false, length = 18)
    private String identifiant;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_naissance", length = 13)
    private Date dateNaissance;
    @Column(name = "nom_arabe", nullable = false, length = 50)
    private String nomArabe;
    @Column(name = "nom_latin", nullable = false, length = 50)
    private String nomLatin;
    @Column(name = "prenom_arabe", nullable = false, length = 50)
    private String prenomArabe;
    @Column(name = "prenom_latin", nullable = false, length = 50)
    private String prenomLatin;
    @Column(name = "lieu_naissance")
    private String lieuNaissance;
    private String lieuNaissanceArabe;
    @Column(name = "photo")
    private String photo;
    @Column(name = "email")
    private String email;

}