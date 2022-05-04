package dz.mesrs.progres.rest.modal.ppm;

// Generated 10 avr. 2014 10:28:25 by Hibernate Tools 3.6.0

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "ref_etablissement", schema = "ppm")
public class RefEtablissement implements java.io.Serializable {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private int id;

	@Column(name = "identifiant", nullable = false, length = 250)
	private String identifiant;
	private Date dateCreation;
	@Column(name = "ll_etablissement_arabe", nullable = false, length = 250)
	private String llEtablissementArabe;
	@Column(name = "ll_etablissement_latin", nullable = false, length = 250)
	private String llEtablissementLatin;
	@Column(name = "ancien_code")
	private String ancienCode;
	@Column(name = "active", columnDefinition = "boolean default true")
	private Boolean active = true;
	@Column(name = "latitude")
	private Double latitude;
	@Column(name = "longitude")
	private Double longitude;

}