package dz.mesrs.progres.rest.dto.examen;

import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class PlanningSessionDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;

	private Integer idPeriode;
	private String codePeriode;
	private String libellePeriode;

	private Integer anneeAcademiqueId;
	private String anneeAcademiqueCode;

	private Integer ouvertureOffreFormationId;
	private Integer offreFormationId;
	private String offreFormationCode;
	private String offreFormationLibelleFr;
	private String offreFormationLibelleAr;

	private Integer cycleId;
	private String cycleCode;
	private String cycleLibelleLongLt;
	private Integer niveauId;
	private String niveauCode;
	private String niveauLibelleLongLt;

	private Integer situationId;
	private String situationCode;
	private String situationLibelleFr;
	private String situationLibelleAr;

	private String intitule;
	private Date dateDebut;
	private Date dateFin;
	private Integer numeroSession;
	private Integer ncTypeSessionId;
	private String ncTypeSessionCode;
	private String ncTypeSessionLibelleFr;

	private Date dateCreation;
	private Date datePublication;
	private Date dateCloture;
	private String refCodeEtablissement;
	private Boolean avecControleContinu;
	private Boolean avecControleIntermediaire;
	private Boolean notesValide;
	private Double coefficient;
	
	private Integer sessionARemplacerId;
	private String sessionARemplacerIntitule;
	
	private Boolean avecControle;
	private Double coefficientNoteEliminatoire;
	
	private Integer nombreNote;
	
	private Boolean estMigree;

	private Set<ExamenSessionDto> examenSessionDtos = new HashSet<ExamenSessionDto>(0);

	public PlanningSessionDto() {
	}

	// public String getRefCodeTypeSession() {
	// return this.refCodeTypeSession;
	// }
	//
	// public void setRefCodeTypeSession(String refCodeTypeSession) {
	// this.refCodeTypeSession = refCodeTypeSession;
	// }

	// public String getRefTypeSessionSessionLibelleFr() {
	// return refTypeSessionSessionLibelleFr;
	// }

	// public void setRefTypeSessionSessionLibelleFr(
	// String refTypeSessionSessionLibelleFr) {
	// this.refTypeSessionSessionLibelleFr = refTypeSessionSessionLibelleFr;
	// }

	public Boolean isAvecControle() {
		avecControle = (avecControleContinu || avecControleIntermediaire);
		return avecControle;
	}

	public Boolean isEstMigree() {
		return estMigree;
	}

}
