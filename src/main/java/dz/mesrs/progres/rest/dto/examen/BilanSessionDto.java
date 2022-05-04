package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BilanSessionDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private int type;
	private Integer oofId;
	private String offreFormationLibelleFr;
	private String offreFormationLibelleAr;
	private Long deliberationSessionId;
	private Integer periodeId;
	private String periodeLibelleFr;
	private String periodeLibelleAr;
	private List<BilanUeDto> bilanUes;
	List<BilanMcDto> bilanMcDtos;
	private List<BilanSessionDto> sessions;
	private Date dateDeliberation;
	private BilanSessionDto bilanSessionDtoMax;
	
	private Long dossierInscriptionAdministrativeId;
	
	private Long individuId;
	private Integer situationId;
	private Long planningSessionId;
	private String psIntitule;
	private Date psDateFin;
	private String psRefCodeTypeSession;

	private String nomArabeEtudiant;
	private String nomLatinEtudiant;
	private String prenomArabeEtudiant;
	private String prenomLatinEtudiant;
	private Date dateNaissanceEtudiant;
	private String lieuNaissanceEtudiant;

	private Integer typeDecisionId;
	private String typeDecisionCode;
	private String typeDecisionLibelleFr;
	private String typeDecisionLibelleAr;
	
	private Integer mentionId;
	private String mentionCode;
	private String mentionLibelleFr;
	private String mentionLibelleAr;
	private String mentionLibelle;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;
	
	private Integer refEtablissementId;
	private String refEtablissementCode;
	private String refEtablissementLibelleFr;
	
	private Double moyenne;
	private Double moyenneSn;
	private Double credit;
	private Double creditObtenu;
	private Double creditAcquis;
	private Double cumulCreditPrecedent;

	private Boolean annuel;
	
	private Boolean bilanFinal;
	
	private String matriculeEtudiant;
	private String numeroInscriptionEtudiant;
	
	private String sessionIntitule;
	
	private Integer cycleId;
	private String cycleCode;
	private String cycleLibelleLongLt;
	private Integer niveauId;
	private String niveauCode;
	private int niveauRang;
	private String niveauLibelleLongLt;
	

	private Boolean creditMinObtenu;
	private Boolean oldSession;
	
	private List<BilanSessionDto> bilanSessionDtos;
	
	private Long dossierEtudiantId;
	private Double moyenneGenerale;
	private String formattedMG;
	private Boolean passageL1AvecDette;
	private String styleClass;
	private Boolean admis;
	
	private List<BilanSessionDto> bilanAnnuels;
	
	private Long bilanParentId;
	private String columnIntitule;
	private String urlPhoto;
	private int totalAquis;
	private int effectif;
	private Double tauxReussite;
	private Double sommeMoyenne;
	private Double moyennePromo;
	private Double moyenneControleContinu;
	private Double noteControleIntermediaire;
	private Double noteExamen;
	private Double noteSession;
	private String effectifTauxReussite;
	private Boolean addSession1;
	private String intituleSession1;
	private Double moyenneControleContinuSession1;
	private Double noteControleIntermediaireSession1;
	private Double noteExamenSession1;
	private Double moyenneGeneraleSession1;
	private Double moyenneControleContinuSession2;
	private Double noteControleIntermediaireSession2;
	private Double noteExamenSession2;
	private Double moyenneGeneraleSession2;
	private Boolean addSession2;
	private String intituleSession2;
	private Boolean avecControleContinu;
	private Boolean avecControleIntermediaire;
	private Double coefficientControleContinu;
	private Double coefficientExamen;
	private Double coefficient;
	private Double coefficientControleIntermediaire;
	private Integer rattachementMcId;
	private Boolean estMigree;
	private Date dateGeneration;
	private Long idDeliberationAnnuel;
	private Date dateDeliberationSn;
	private Date dateDeliberationSRattrapage;


}
