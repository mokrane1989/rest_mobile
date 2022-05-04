package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NoteEvaluationControleContinuDto implements Serializable {



	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private Double note;
	private Double oldNote;
	private Double coefficient;

	private Boolean absent;
	private Boolean noteAcquiseDoublant;
	private String observation;
	private Double somCoefficient;
	private Double somNote;
	private Double moyenneAp;
	private String formatCoefficient;
	private String formatMoyenneAp;
	private String formatNote;
	
	private Integer anneeAcademiqueId;
	
	private Long evaluationControleContinuId;
	private Date dateEvaluation;
	private Long idTypeEvaluation;
	private String typeEvaluationLibelleFr;
	private String typeEvaluationLibelleAr;
	
	private Integer oofId;
	private Integer periodeId;
	private String llPeriode;
	private Integer associationGroupePedagogiqueId;
	
	private Integer apId;
	private String apCode;
	private Integer rattachementMcId;
	private String rattachementMcMcLibelleFr;
	private String rattachementMcUeLibelleFr;
	private Boolean comptablise;
	private String ncTypeAppreciationLlFr;
	private String ncTypeAppreciationLlAr;
	private String ncTypeAppreciationCode;

	private Long affectationGpId;
	private Long groupePedagogiqueId;
	private Long diaId;
	private String numeroInscription;
	private Long dossierEtudiantId;
	private String numeroMatricule;
	
	// Etudiant
	private Long individuId;
	private String individuIdentifiant;
	private String etudiantNomArabe;
	private String etudiantNomLatin;


	private String etudiantPrenomArabe;
	private String etudiantPrenomLatin;
	private Date etudiantDateNaissance;
	private Boolean exclu;

	private String historique;


}
