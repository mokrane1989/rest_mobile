package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InscriptionExamenDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private Integer salleExamenId;
	private Integer refLieuId;
	private String refLieuLibelle;
	private Integer refLieuTypeId;
	private String refLieuTypeLibelle;
	private Short refLieuCapacite;
	private Integer examenSessionId;
	private Integer rattachementMcId;
	private Integer ueId;
	private String ueCode;
	private String ueLibelleFr;
	private String ueNatureLlFr;

	private Integer mcId;
	private String mcCode;
	private String mcLibelleFr;
	private String mcLibelleAr;
	private Double rattachementMcCoefficient;
	private Double rattachementMcCredit;
	private Double mcCreditObtenu;
	private Double rattachementMcNoteObtension;
	private Double rattachementMcNoteDeBase;
	private Double rattachementMcNoteEliminatoire;
	private double noteEliminatoire;
	private Boolean noteAcquiseDoublant;

	private Double coefficientExamen;
	private Double coefficientControleContinu;
	private Double coefficientControleIntermediaire;
	private double totalCoefficient;
	
	private Long planningSessionId;
	private String planningSessionIntitule;
	private boolean avecControleContinu;
	
	private Integer idPeriode;
	private String codePeriode;
	private String libellePeriode;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;

	private Long dossierInscriptionAdministrativeId;
	private String numeroInscription;
	private Integer dossierEtudiantId;
	private String numeroMatricule;
	
	private String nin;
	private Long individuId;
	private String individuNomArabe;
	private String individuNomLatin;
	private String individuPrenomArabe;
	private String individuPrenomLatin;
	private Date individuDateNaissance;

	private boolean copieNonRemise;
	private boolean absent;
	private String motifAbsence;
	private boolean absenceJustifie;
	private boolean exclu;
	private boolean conge;

	private boolean oldCopieNonRemise;
	private boolean oldAbsent;
	private String oldMotifAbsence;
	private boolean oldAbsenceJustifie;
	private Double noteExamen;
	private Double oldNoteExamen;
	private Double noteJury;
	private Double noteJuryToDisplay;
	private boolean modifiableByJury;
	private boolean noteObtenu;
	private boolean readerByJury;
	private boolean etudiantRachete;
	private String urlPhoto;
	private Double noteMax;
	private Double noteControleContinu;
	private Double noteControleIntermediaire;
	private Date dateExamen;
	private Date heureDebut;
	private Date heureFin;
	private String refTypeExamen;
	private String refTypeExamenLibelle;
	private boolean subscribed;
	private Double moyenneControleContinu;
	private double moyenneGenerale;
	private String etudiantSexe;
	private String historique;
	private String nomGroupe;
	private String nomSection;


}
