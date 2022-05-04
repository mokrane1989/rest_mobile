package dz.mesrs.progres.rest.modal.conge;

// Generated 8 juin 2014 14:16:38 by Hibernate Tools 3.6.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "conge_academique", schema = "cursus"
// uniqueConstraints=@UniqueConstraint(columnNames={"id_annee_academique",
// "id_dossier_inscription"})
)
public class CongeAcademique implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_annee_academique")
	private AnneeAcademique anneeAcademique;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_demande", length = 13)
	private Date dateDemande;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_debut_demande", length = 13)
	private Date dateDebutDemande;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_fin_demande", length = 13)
	private Date dateFinDemande;

	@Column(name = "resultat")
	private Boolean resultat;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_resultat", length = 13)
	private Date dateResultat;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_debut_accordee", length = 13)
	private Date dateDebutAccordee;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_fin_accordee", length = 13)
	private Date dateFinAccordee;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dossier_inscription")
	private DossierInscriptionAdministrative dossierInscriptionAdministrative;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_type_conge")
	private Nomenclature typeConge;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_motif_refus")
	private Nomenclature motifRefus;

	@Column(name = "observation")
	private String observation;


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_validation_demande", length = 29)
	private Date dateValidationDemande;

	@Column(name = "demande_validee")
	private Boolean demandeValidee;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_validation_resultat", length = 29)
	private Date dateValidationResultat;

	@Column(name = "resultat_valide")
	private Boolean resultatValide;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_demande_reintegration", length = 13)
	private Date dateDemandeReintegration;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_resultat_reintegration", length = 13)
	private Date dateResultatReintegration;
	
	@Column(name = "reintegration_validee")
	private Boolean reintegrationValidee;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_validation_reintegration", length = 29)
	private Date dateValidationReintegration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_annee_academique_reintegration")
	private AnneeAcademique anneeAcademiqueReintegration;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_motif_refus_reintegration")
	private Nomenclature motifRefusReintegration;

	public CongeAcademique() {
	}


}
