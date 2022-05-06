package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExamenSessionDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	// private RattachementMc rattachementMc;
	private Integer rattachementMcId;
	private Double rattachementMcCoefficient;
	private Double rattachementMcNoteObtension;
	private Double rattachementMcNoteDeBase;
	private Double rattachementMcNoteEliminatoire;
	private Integer ueId;
	private String ueCode;
	private String ueLibelleFr;

	private Integer mcId;
	private String mcCode;
	private String mcLibelleFr;
	private String mcLibelleAr;
	private Integer mcCoefficient;
	private Integer mcCredit;

	private Long planningSessionId;
	private String planningSessionIntitule;
	private Integer ouvertureOffreFormationId;
	private double planningCoefficientNoteEliminatoire;

	private String numeroSession;
	private String typeSession;
	private String typeSessionAr;
	private Integer cycleId;
	private String cycleCode;
	private String cycleLibelleLongLt;
	private Integer niveauId;
	private String niveauCode;
	private String niveauLibelleLongLt;

	private Integer idPeriode;
	private String codePeriode;
	private String libellePeriode;
	private String libellePeriodeAr;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;
	private Integer situationId;

	private Date dateExamen;
	private Date heureDebut;
	private Date heureFin;
	private Integer duree;
	private Boolean anonymat;
	private Boolean noteGereParEnseignant;
	private Date heureDebutReelle;
	private Date heureFinReelle;
	private String incident;
	private Integer nbCopieRemises;
	private Integer ncTypeExamenId;
	private String ncTypeExamenCode;
	private String ncTypeExamenLibelleFr;
	private Date dateCreation;
	private String refModeInscription;
	private Date dateExamenReelle;
	private Integer nbInscrits;
	private Long modeleExamenId;
	private double moyenneSession;
	private String salleResponsableExamen;
	private String responsableList;

}
