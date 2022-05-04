package dz.mesrs.progres.rest.dto.cursus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AffectationGroupePedagogiqueDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long dossierInscriptionId;
	private Long dossierEtudiantId;
	
	private Long individuId;
	private String individuIdentifiant;
	
	private String nomEtudiant;
	private String prenomEtudiant;
	private String nomEtudiantArabe;
	private String prenomEtudiantArabe;
	private String numeroMatricule;
	private String numeroInscription;
	private String etudiantCivilite;
	private String urlPhoto;
	private String etudiantSexe;
	
	private Long groupePedagogiqueId;
	private String codeGroupePedagogique;
	private String nomGroupePedagogique;

	private Long idSection;
	private String codeSection;
	private String nomSection;
	
	private Long refGroupeId;
	
	private Date dateAffectation;
	private Date dateNaissanceEtudiant;
	@Getter(onMethod_=@JsonIgnore)
	private double moyenneBac;
	@Getter(onMethod_=@JsonIgnore)
	private double lastMoyenne;

	private Integer periodeId;
	private String periodeCode;
	private String periodeLibelleLongLt;





	public AffectationGroupePedagogiqueDto() {
		super();
	}

	public AffectationGroupePedagogiqueDto(Long id) {
		super();
		this.id = id;
	}

}
