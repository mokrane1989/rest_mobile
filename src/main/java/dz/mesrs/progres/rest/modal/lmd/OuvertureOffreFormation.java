package dz.mesrs.progres.rest.modal.lmd;

import dz.mesrs.progres.rest.modal.ppm.RefEtablissement;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ouverture_offre_formation", schema = "lmd")
public class OuvertureOffreFormation  {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_offre_formation", nullable = false)
	private OffreFormation offreFormation;

	@ManyToOne
	@JoinColumn(name = "id_etablissement", nullable = false)
	private RefEtablissement refEtablissement;
	// code filiere et etablissement ESI
	@Column(name = "ancien_code_filiere", length = 25)
	private String ancienCodeFiliereEsi;
	@Column(name = "ancien_code_etablissement", length = 25)
	private String ancienCodeEtablissementEsi;
	@Column(name = "rang")
	private Integer rang;
	@ManyToOne
	@JoinColumn(name = "id_annee_academique")
	private AnneeAcademique anneeAcademique;

}