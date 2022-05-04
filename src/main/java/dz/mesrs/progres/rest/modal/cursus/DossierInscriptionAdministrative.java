package dz.mesrs.progres.rest.modal.cursus;


import dz.mesrs.progres.rest.modal.lmd.Niveau;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import dz.mesrs.progres.rest.modal.ppm.RefEtablissement;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "dossier_inscription_administrative", schema = "cursus")
public class DossierInscriptionAdministrative   implements java.io.Serializable {


	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_dossier_etudiant")
	private DossierEtudiant dossierEtudiant;

	@Column(name = "numero_inscription")
	private String numeroInscription;
	@ManyToOne
	@JoinColumn(name = "id_annee_academique")
	private AnneeAcademique anneeAcademique;
	@ManyToOne
	@JoinColumn(name = "id_ouverture_of")
	private OuvertureOffreFormation ouvertureOffreFormation;
	@ManyToOne
	@JoinColumn(name = "id_niveau")
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "id_etablissement")
	private RefEtablissement refEtablissement;


}