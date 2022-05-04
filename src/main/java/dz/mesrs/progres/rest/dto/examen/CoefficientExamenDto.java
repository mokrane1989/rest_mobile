package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CoefficientExamenDto implements Serializable {


	private static final long serialVersionUID = 1L;
	private long id;
	private Integer oofId;
	private String ofLibelleFr;
	private Integer periodeId;
	private String periodeLibelleFr;
	private String niveauLibelleFr;
	private Integer rattachementMcId;
	private String mcLibelleFr;
	private double mcCredit;
	private double mcCoefficient;
	private String ueLibelleFr;
	private double coefficientExamen;
	private double coefficientControleContinu;
	private double coefficientControleIntermediaire;
	private String anneeAcademiqueCode;
	private short anneeAcademiquePremiereAnnee;
	private short anneeAcademiqueDeuxiemeAnnee;
}