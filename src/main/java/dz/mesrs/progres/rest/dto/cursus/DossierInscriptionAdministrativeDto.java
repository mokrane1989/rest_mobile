package dz.mesrs.progres.rest.dto.cursus;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DossierInscriptionAdministrativeDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String numeroInscription;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;

	private String refLibelleTypeInscription;
	private String refLibelleNatureInscription;
	private String refLibelleStatutEtudiant;

	private Integer rang;
	private Boolean estClassique;

	private Integer situationId;
	private String situationLibelleFr;
	private String situationLibelleAr;

	private Long dossierId;

	private Long dossierEtudiantId;
	private String numeroMatricule;

	private String resultRefCodeDomaine;
	private String resultRefCodeFiliere;
	private String resultRefCodeSpecialite;

	private Integer ouvertureOffreFormationId;
	private Integer offreFormationId;
	private String offreFormationCode;
	private String offreFormationLibelleFr;
	private String offreFormationLibelleAr;

	private String refCodeCycle;
	private String refCodeNiveau;
	private String refLibelleCycle;
	private String refLibelleCycleAr;
	private String refLibelleNiveau;

	private Date dateInscription;
	private String centreScolarite;

	private String typeDossier;
	private String typeDossierLibelleFr;
	private String typeDossierLibelleAr;
	private Date dateCreation;

	private Long exclusionId;
	private Long congeAcademiqueId;
	private Boolean estMigree;
	private Integer idDomaine;
	private String codeDomaine;
	private String libelleCodeDomaine;
	private String llDomaine;
	private String llDomaineArabe;
	private Integer idFiliere;
	private String codeFiliere;
	private String llFiliereArabe;
	private String llFiliere;
	private String libelleCodeFiliere;

	private Integer ofIdDomaine;
	private String ofCodeDomaine;
	private String ofLlDomaine;
	private String ofLlDomaineArabe;
	private Integer ofIdFiliere;
	private String ofCodeFiliere;
	private String ofLlFiliereArabe;
	private String ofLlFiliere;
	private Integer ofIdSpecialite;
	private String ofCodeSpecialite;
	private String ofLlSpecialiteArabe;
	private String ofLlSpecialite;
	private String ofLibelleCodeSpecialite;
	private String photoEtudiant;

	// Etudiant Individu
	private Long individuId;
	private String nin;
	private String individuNomArabe;
	private String individuNomLatin;
	private String individuPrenomArabe;
	private String individuPrenomLatin;
	private Date individuDateNaissance;
	private String individuLieuNaissance;
	private String individuLieuNaissanceArabe;
	private String individuNationaliteLibelleLongFr;
	private String individuNationaliteLibelleLongAr;
	private String individuSituationFamilialeLibelleLongFr;
	private String IndividuServiceNationalLibelleLongFr;
	private String individuGroupeSanguinLibelleLongFr;
	private String individuNomMereLatin;
	private String individuPrenomMereLatin;
	private String individuPrenomPereLatin;
	private String individuSituationFamilialeLibelleLongAr;
	private String individuServiceNationalLibelleLongAr;
	private String individuGroupeSanguinLibelleLongAr;
	private String individuNomMereArabe;
	private String individuPrenomMereArabe;
	private String individuPrenomPereArabe;
	private String individuCiviliteLibelleLongFr;
	private String individuCiviliteLibelleLongAr;
	private String individuWilayaNaissanceLibelleLongFr;
	private String individuWilayaNaissanceLibelleLongAr;
	private String individuWilayaNaissanceCode;
	private Integer individuWilayaNaissanceId;

	private String refLibelleNiveauArabe;
	private String refLibelleDomaineArabe;
	private String refLibelleFiliereArabe;
	private String refLibelleSpecialiteArabe;
	private Integer refEtablissementId;
	private String refCodeEtablissement;
	private String llEtablissementArabe;
	private String llEtablissementLatin;

	// wilaya de naissance
	private String individuibelleWilayaNaissance;
	private String refCodeWilayaNaissance;
	private String adresseResidence;

	// bac
	private Long dossierBachelierId;
	private String matriculeBac;
	private double moyenneBac;
	private String telephoneBachelier;
	private String adresseResidenceBachelier;
	private String anneeBac;
	private double lastMoyenne;
	private String photo;
	private String refCodeSexeBachelier;
	private String refCodeWilayaNaissanceBachelier;
	private String refCodeWilayaBacBachelier;
	private String refCodeWilayaResidenceBachelier;
	private String libelleVilleNaissanceBachelier;
	private String refCodeSerieBacBachelier;
	private String libelleSerieBacBachelier;
	private String refCodeFiliereBachelier;
	private String numeroChoixBachelier;
	private String noteAffectationBachelier;
	private String refCodeEtablissementRecoursBachelier;
	private String refCodeFiliereRecoursBachelier;
	private String refCodeEtablissementOrientationBachelier;
	private String refCodeFiliereOrientationBachelier;
	private String refCodeTypeAffectationBachelier;
	private String refCodeEtablissementAffectationBachelier;
	private String refCodeFiliereAffectationBachelier;

	// Cycle+niveau
	private Integer cycleId;
	private String cycleCode;
	private String cycleLibelleLongLt;
	private String cycleLibelleLongAr;
	private Integer niveauId;
	private String niveauCode;
	private Integer niveauRang;
	private String niveauLibelleLongLt;
	private String niveauLibelleLongAr;

	// Informations ONOU (bourse et hebergement

	private Boolean herbergementDemande;
	private Boolean bourseDemandee;

	// type de la demande d'hebergement
	private Integer idTypeDemandeHebergement;
	private String typeDemandeHebergementLibelleFr;
	private String typeDemandeHebergementLibelleAr;

	// private NomenclatureDto typeDemandeHebergement;
	private Integer idTypeDemandeBourse;
	private String typeDemandeBourseLibelleFr;
	private String typeDemandeBourseLibelleAr;

	// private NomenclatureDto typeDemandeBourse;
	private String observationScolariteHebergement;
	private String observationScolaritBourse;
	private Boolean herbergementAccorde;
	private Boolean bourseAccordee;

	// type d'hebergement
	private Integer idTypeHebergement;
	private String typeHebergementLibelleFr;
	private String typeHebergementLibelleAr;

	// private NomenclatureDto typeHebergement;
	private String lieuHebergement;
	private Integer ancienneteHebergement;
	private String observationOnouHebergement;
	private String observationOnouBourse;
	private Float montantBourse;
	private Integer ancienneteBourse;
	private Boolean decisionOnouValide;
	private Date dateDecisionOnou;
	private String etudiantSexe;
	private String etudiantCivilite;

	public DossierInscriptionAdministrativeDto() {

	}
}