package dz.mesrs.progres.rest.dto.bac;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoteMatiereBacDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Getter(onMethod_=@JsonIgnore)
	private int idImportation;
	@Getter(onMethod_=@JsonIgnore)
	private String matriculeBac;
	private Double note;
	private String refCodeMatiere;
	private String refCodeMatiereLibelleFr;
	private String refCodeMatiereLibelleAr;
	@Getter(onMethod_=@JsonIgnore)
	private String anneeBac;

	public NoteMatiereBacDto() {
	}

}