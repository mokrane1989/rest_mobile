package dz.mesrs.progres.rest.dto.conge;

import lombok.*;

import java.util.Date;


@Data
public class CongeAcademiqueDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Integer ouvertureOffreFormationId;
	private String libelleOffreFormationFr;
	private String libelleOffreFormationAr;

	private Integer cycleId;
	private String cycleCode;
	private String cycleLibelleLongLt;
	private String cycleLibelleLongAr;
	private Integer niveauId;
	private String niveauCode;
	private Integer niveauRang;
	private String niveauLibelleLongLt;
	private String niveauLibelleLongAr;

	private Long idDossierEtudiant;
	private Integer idEtablissement;
	private Long dossierInscriptionId;
	private String dossierEtudiantMatricule;

	private Date dateDemande;

	private Date dateDebutDemande;
	private Date dateFinDemande;

	private Boolean resultat;
	private Date dateResultat;
	private Date dateDebutAccordee;
	private Date dateFinAccordee;

	private Integer ncMotifRefusId;
	private String ncMotifRefusLibelleLongFr;

	private Date dateReintegration;

	private Integer ncTypeCongeId;
	private String ncTypeCongeLibelleLongFr;

	private Integer situationId;
	private String libelleSituation;

	private Boolean demandeValidee;
	private Boolean resultatValide;
	private Boolean reintegrationValidee;

	private Date dateValidationDemande;
	private Date dateValidationResultat;
	private Date dateValidationReintegration;
	
	private Date dateDemandeReintegration;
	
	private Date dateResultatReintegration;

	// Individu
	private Integer individuId;
	private String individuNin;
	private String EtudiantNomArabe;
	private String EtudiantNomLatin;
	private String EtudiantPrenomArabe;
	private String EtudiantPrenomLatin;
	private Date EtudiantDateNaissance;
	private String EtudiantLieuNaissance;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;
	private Short anneeAcademiquePremiereAnnee;
	private Short anneeAcademiqueDeuxiemeAnnee;

	private Integer anneeAcademiqueReintegrationId;
	private String anneeAcademiqueReintegrationCode;
	private Short anneeAcademiqueReintegrationPremiereAnnee;
	private Short anneeAcademiqueReintegrationDeuxiemeAnnee;

	// BAC
	private Integer bacId;
	private String bacMatricule;
	private String bacRefCodeSerie;
	private String bacLibelleSerie;

	private String observation;

	private Integer ncMotifRefusReintegrationId;
	private String ncMotifRefusReintegrationLibelleLongFr;
	
	public CongeAcademiqueDto() {

	}

	public String getEtudiantNomArabe() {
		return EtudiantNomArabe;
	}

	public void setEtudiantNomArabe(String etudiantNomArabe) {
		EtudiantNomArabe = etudiantNomArabe;
	}

	public String getEtudiantNomLatin() {
		return EtudiantNomLatin;
	}

	public void setEtudiantNomLatin(String etudiantNomLatin) {
		EtudiantNomLatin = etudiantNomLatin;
	}

	public String getEtudiantPrenomArabe() {
		return EtudiantPrenomArabe;
	}

	public void setEtudiantPrenomArabe(String etudiantPrenomArabe) {
		EtudiantPrenomArabe = etudiantPrenomArabe;
	}

	public String getEtudiantPrenomLatin() {
		return EtudiantPrenomLatin;
	}

	public void setEtudiantPrenomLatin(String etudiantPrenomLatin) {
		EtudiantPrenomLatin = etudiantPrenomLatin;
	}

	public Date getEtudiantDateNaissance() {
		return EtudiantDateNaissance;
	}

	public void setEtudiantDateNaissance(Date etudiantDateNaissance) {
		EtudiantDateNaissance = etudiantDateNaissance;
	}

	public String getEtudiantLieuNaissance() {
		return EtudiantLieuNaissance;
	}

	public void setEtudiantLieuNaissance(String etudiantLieuNaissance) {
		EtudiantLieuNaissance = etudiantLieuNaissance;
	}

}
