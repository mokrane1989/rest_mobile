package dz.mesrs.progres.rest.dto.cursus;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssociationGroupePedagogiqueDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Long groupePedagogiqueId;
	private Long refGroupeId;
	private String groupePedagogiqueNom;

	private Long refSectionionId;
	private String sectionNom;

	private String apCode;
	private String refCodeTypeAp;
	private String refCodeModeEnseignement;
	private Double apVolumeHoraire;
	private Integer apSeuil;
	private Integer apGroupesPrevus;
	private Integer apId;
	private String obervation;
	private Date dateAttachement;

	private Integer rattachementMcId;
	private Integer rattachementMcMcId;
	private String rattachementMcMcCode;
	private String rattachementMcMcLibelleFr;
	private String rattachementMcMcAbreviationFr;
	private Integer rattachementMcMcCredits;
	private Double rattachementMcMcVolumeHorairePerso;
	private Double rattachementMcMcVolumeHorairePres;
	private String rattachementMcMcRefCodeTypeMc;
	private Boolean rattachementMcOptionnelle;

	private Integer rattachementMcUeId;
	private String rattachementMcUeCode;
	private String rattachementMcUeLibelleFr;
	private String rattachementMcUeAbreviationFr;
	private String rattachementMcUeRefCodeTypeUe;
	private String rattachementMcUeRefCodeNatureUe;
	private String rattachementMcUeRefCodeStatutUe;
	private Integer rattachementMcUeCredits;
	private Integer periodeId;
	private Integer oofId;

	public AssociationGroupePedagogiqueDto() {
	}

	public final String getNomGroupe(){
		StringBuilder nom = new StringBuilder();
		
		if(sectionNom != null && !sectionNom.isEmpty()) {
			nom.append(sectionNom).append(" / ");
		}
		
		if(groupePedagogiqueNom != null && !groupePedagogiqueNom.isEmpty()) {
			nom.append(groupePedagogiqueNom);
		}
		
		return nom.toString();
	}

}
