package dz.mesrs.progres.rest.dto.bac;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DossierBachelierDto implements java.io.Serializable {

	private static final long serialVersionUID = 5595401399463125298L;
	
	private Long id;
	
	private String nin;
	private String matricule;
	
	private String nomAr;
	private String prenomAr;
	
	private String nomFr;
	private String prenomFr;
	
	private Date dateNaissance;
	
	private String moyenneBac;
	
	private String prenomPere;
	private String nomPrenomMere;
	
	private String telephone;
	
	private String adresseResidence;
	
	private String refCodeSexe;
	private String refCodeWilayaNaissance;
	private String refCodeWilayaBac;
	private String refCodeWilayaResidence;
	private String refCodeSerieBac;
	private String libelleVilleNaissance;
	private String libelleSerieBac;
	@Getter(onMethod_=@JsonIgnore)
	private int tag;
	@Getter(onMethod_=@JsonIgnore)
	private int idImportation;
	@Getter(onMethod_=@JsonIgnore)
	private int idImportationAffectation;
	@Getter(onMethod_=@JsonIgnore)
	private int idDossierEtudiant;
	private String annee;
	private Boolean estClassique;

	private String refCodeEtablissement;
	private String refCodeFiliere;
	
	private String numeroChoix;
	private String noteAffectation;
	
	private String refCodeEtablissementRecours;
	private String refCodeFiliereRecours;
	
	private String refCodeEtablissementOrientation;
	private String refCodeFiliereOrientation;
	
	private String refCodeTypeAffectation;
	private String refCodeEtablissementAffectation;
	private String refCodeFiliereAffectation;
	private String libelleFiliereAffectation;
	
	private String codeFiliereInscription;
	
	private String photoEtudiant;
	private String photo;
	private String anneeBac;
	
	private Boolean estMigree ;
	private Boolean affectationModifiee = null;

	private Boolean soumiTest ;
	private Integer idResultatTest;
	private String resultatTest;
	private Integer  statutAffectation;


	private List<NoteMatiereBacDto> notesBacheliers;

	public DossierBachelierDto() {
	}

	public Double getMoyenneGeneraleBac() {
		return Double.valueOf(moyenneBac);
	}

	public Boolean isAffectationModifiee() {
		return affectationModifiee;
	}

}