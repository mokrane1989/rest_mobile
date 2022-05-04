package dz.mesrs.progres.rest.dto.lmd;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
@Data
public class PeriodeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String code;
	private String libelleLongLt;
	private String libelleLongAr;
	private String libelleCourtLt;
	private String libelleCourtAr;
	private int rang;
	private int credit;
	private String refCodePeriodicite;
	@Getter(onMethod_=@JsonIgnore)
	private int idNiveau;
	private int rangNiveau;
	private String refCodePeriode;
	private String libelleLongFrNiveau;
	private String libelleLongFrCycle;

	// Periode de l annee (nomeclature)
	private Integer ncPeriodeId;
	private String ncPeriodeCode;
	private String ncPeriodeLibelle;
}