package dz.mesrs.progres.rest.modal.cursus;

import com.fasterxml.jackson.annotation.JsonProperty;
import dz.mesrs.progres.rest.modal.ppm.RefEtablissement;
import dz.mesrs.progres.rest.modal.ppm.RefIndividu;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "dossier_etudiant", schema = "cursus")
public class DossierEtudiant  {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@OneToOne
	@JoinColumn(name = "id_individu")
	private RefIndividu individu;

	@JsonProperty
	@OneToOne
	@JoinColumn(name = "id_dossier_bachelier")
	private DossierBachelier dossierBachelier;
	@Column(name = "numero_matricule", length = 25)
	private String numeroMatricule;

	@ManyToOne
	@JoinColumn(name = "id_etablissement")
	private RefEtablissement refEtablissement;

}