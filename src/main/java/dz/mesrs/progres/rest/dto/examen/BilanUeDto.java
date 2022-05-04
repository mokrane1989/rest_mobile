
package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class BilanUeDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private Long bilanSessionId;
	
	private Integer repartitionUeId;
	private String ueLibelleFr;
	
	private String ueCode;
	private String ueType;
	private Double moyenne;
	private Double coefficient;
	private Double credit;
	private Double creditObtenu;
	private Double creditAcquis;
	private String ueNatureLlFr;
	private String ueNatureLlAr;
	private String ueNatureLcFr;
	private String ueNatureLcAr;
	private String ueNatureCode;
	private List<BilanMcDto> bilanMcs;
	private Double ueNoteObtention;
	private boolean ueAcquis;
	private Double ueCredit;
	private int totalAquis;
	private int effectif;
	private Double tauxReussite;
	private String pourcentageReussite;
	private Double sommeMoyenne;
	private Double moyennePromo;
	private String effectifTauxReussiteSession1;
	private String effectifTauxReussiteSession2;
	private String effectifTauxReussite;


}
