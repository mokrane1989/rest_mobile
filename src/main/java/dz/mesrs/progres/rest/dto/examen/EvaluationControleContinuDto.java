package dz.mesrs.progres.rest.dto.examen;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
public class EvaluationControleContinuDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	
	private Long groupePedagogiqueId;
	private String gpNomAffichage;
	private String gpNomSection;

	private Integer oofId;
	private String ofLibelleLongFr;
	private String ofLibelleCourtFr;
	private String ofAbrevFr;
	private String ofLibelleLongAr;
	private String ofLibelleCourtAr;
	private String ofAbrevAr;
	
	private Integer periodeId;
	private String periodeLibelleLongLt;
	private String periodeLibelleLongAr;
	private String periodeLibelleCourtLt;
	private String periodeLibelleCourtAr;
	
	private String ncTypeEvalLlFr;
	private String ncTypeEvalLlAr;
	private Integer ncTypeEvalId;
	private String ncTypeEvalCode;
	
	private Integer anneeAcademiqueId;
	
	private Integer situationEntiteId;
	private String situationLibelle;
	
	private Date dateEvaluation;
	
	private Double coefficient;
	
	private Boolean comptablise;
	private Boolean desctiverSaisiEnseignant;

	private Integer apId;
	private String apCode;
	
	private Integer rattachementMcId;
	private Integer rattachementMcMcId;
	private String rattachementMcLibelle;
	private Integer rattachementMcUeId;
	private String rattachementMcUeLibelle;
	private Double rattachementMcNoteDeBase;
	
	private String refCodeTypeAp;
	
	private String objectif;
	private String competence;
	
	private Integer associationGroupePedagogiqueId;

	private Long refGroupeId;


	public final String getNomGroupe(){
		StringBuilder nom = new StringBuilder();
		
		if(gpNomSection != null && !gpNomSection.isEmpty()) {
			nom.append(gpNomSection).append(" / ");
		}
		
		if(gpNomAffichage != null && !gpNomAffichage.isEmpty()) {
			nom.append(gpNomAffichage);
		}
		
		return nom.toString();
	}

}
