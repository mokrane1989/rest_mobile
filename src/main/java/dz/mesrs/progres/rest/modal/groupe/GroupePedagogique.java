package dz.mesrs.progres.rest.modal.groupe;

// Generated 8 juin 2014 09:47:18 by Hibernate Tools 3.6.0


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import dz.mesrs.progres.rest.modal.ppm.RefEtablissement;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Data
@Entity
@Table(name = "groupe_pedagogique", schema = "cursus")
public class GroupePedagogique implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private long id;
	@ManyToOne
	@JoinColumn(name = "section")
	private GroupePedagogique section;
	@ManyToOne
	@JoinColumn(name = "id_oof")
	@Getter(onMethod_=@JsonIgnore)
	private OuvertureOffreFormation oof;
	@ManyToOne
	@JoinColumn(name = "id_periode")
	private Periode periode;

	//private Nomenclature ncTypeGroupe;
	//private RefGroupe refGroupe;
	@Column(name = "capacite_min")
	private Integer capaciteMin;
	@Column(name = "capacite_max")
	private Integer capaciteMax;
	@ManyToOne
	@JoinColumn(name = "id_ref_etablissement")
	@Getter(onMethod_=@JsonIgnore)
	private RefEtablissement refEtablissement;

	@ManyToOne
	@JoinColumn(name = "annee_academique", nullable = false)
   @Getter(onMethod_=@JsonIgnore)
	private AnneeAcademique anneeAcademique;
	@Column(name = "nom_affichage", length = 30, nullable = false)
	private String nomAffichage;
	@Column(name = "nom_affichage_arabe", length = 30, nullable = false)
	private String nomAffichageArabe;
	@Column(name = "mc_optionnelle")
	private Boolean mcOptionnelle;
	@Getter(onMethod_=@JsonIgnore)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
	private Set<GroupePedagogique> sections = new HashSet<GroupePedagogique>(0);
	@Getter(onMethod_=@JsonIgnore)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupePedagogique", cascade = CascadeType.ALL)
	private List<AffectationGroupePedagogique> affectationGroupePedagogiques = new ArrayList<AffectationGroupePedagogique>();



}
