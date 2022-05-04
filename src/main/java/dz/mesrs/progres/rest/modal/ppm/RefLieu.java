package dz.mesrs.progres.rest.modal.ppm;


import dz.mesrs.progres.rest.modal.ppm.RefEtablissement;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ref_lieu", schema = "ppm")
public class RefLieu implements java.io.Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private int id;
	@Column(name = "identifiant", unique = true, nullable = false, length = 50)
	private String identifiant;
	@Column(name = "designation_Fr", length = 100)
	private String designation;
	@Column(name = "designation_Arabe", length = 100)
	private String designationArabe;
	@Column(name = "description_Fr", nullable = false, length = 500)
	private String description;
	@Column(name = "description_arabe", length = 500)
	private String descriptionArabe;
	@Column(name = "acces_handicape")
	private Boolean acceshandicape;
	@Column(name = "lieu_reservable")
	private Boolean reservable;
	@Column(name = "code_porte", length = 20)
	private String codePorte;
	@Column(name = "superficie", length = 10)
	private Short superficie;
	@Column(name = "capacite", length = 10)
	private Short capacite;
	@Column(name = "etage", length = 2)
	private Short etage;
	@Column(name = "adresse")
	private String adresse;
	@Column(name = "adresse_ar")
	private String adresseAr;
	@Column(name = "telephone")
	private Integer telephone;
	@Column(name = "active")
	private Boolean active = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "etablissement")
	private RefEtablissement refEtablissement;
	@Column(name="latitude")
	private Double latitude;
	@Column(name="longitude")
	private Double longitude;


	


}
