package dz.mesrs.progres.rest.modal.cursus;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "dossier_bachelier", schema = "bac")

public class DossierBachelier implements java.io.Serializable  {

    @Id
	@Column(name = "id")
	private Long id;
	@Column(name = "matricule")
	private String matricule;
	@Column(name = "nom_ar", nullable = false)
	private String nomAr;
	@Column(name = "prenom_ar", nullable = false)
	private String prenomAr;
	@Column(name = "nom_fr", nullable = false)
	private String nomFr;
	@Column(name = "prenom_fr", nullable = false)
	private String prenomFr;
	@Column(name = "date_naissance", nullable = false)
	private Date dateNaissance;
	@Column(name = "moyenne_bac", nullable = false)
	private String moyenneBac;
	@Column(name = "ref_code_wilaya_bac", nullable = false)
	private String refCodeWilayaBac;
	@Column(name = "ref_code_serie_bac", nullable = false)
	private String refCodeSerieBac;
	@Column(name = "libelle_serie_bac", length = 150)
	private String libelleSerieBac;

	@Column(name = "annee_bac")
	private String anneeBac;
	@Column(name = "photo")
	private String photo;
	@Column(name = "nin")
	private String nin;
}