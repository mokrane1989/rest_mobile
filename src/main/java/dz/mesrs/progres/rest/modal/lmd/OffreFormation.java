package dz.mesrs.progres.rest.modal.lmd;

// Generated 7 janv. 2014 14:52:44 by Hibernate Tools 4.0.0

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "offre_formation", schema = "lmd")
public class OffreFormation {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Integer id;
	@Column(name = "code", nullable = false, length = 50)
	private String code;
	@ManyToOne
	@JoinColumn(name = "id_domaine", nullable = false)
	private DomaineLMD domaineLMD;
	@ManyToOne
	@JoinColumn(name = "id_filiere")
	private FiliereLmd filiereLmd;
	@ManyToOne
	@JoinColumn(name = "id_specialite")
	private SpecialiteLmd specialiteLmd;

	@Column(name = "libelle_long_fr")
	private String libelleLongFr;


	@Column(name = "libelle_long_ar")
	private String libelleLongAr;
}