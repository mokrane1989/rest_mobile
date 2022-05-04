package dz.mesrs.progres.rest.modal.examen;

// Generated 29 sept. 2014 16:32:23 by Hibernate Tools 3.6.0

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import dz.mesrs.progres.rest.modal.cursus.AssociationGroupePedagogique;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "evaluation_controle_continu", schema = "fve_examen")
public class EvaluationControleContinu implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private long id;
	@ManyToOne
	@JoinColumn(name = "id_association_groupe_pedagogique")
	private AssociationGroupePedagogique associationGroupePedagogique;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_oof")
	@Getter(onMethod_=@JsonIgnore)
	private OuvertureOffreFormation oof;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_periode")
	@Getter(onMethod_=@JsonIgnore)
	private Periode periode;
	@ManyToOne
	@JoinColumn(name = "nc_type_evaluation")
	private Nomenclature typeEvalution;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_annee_academique")
	@Getter(onMethod_=@JsonIgnore)
	private AnneeAcademique anneeAcademique;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_evaluation", length = 13)
	private Date dateEvaluation;
	@Column(name = "coefficient", precision = 17, scale = 17)
	private Double coefficient;
	@Column(name = "comptablise")
	private Boolean comptablise;
	@Column(name = "desactive_saisi_enseignant")
	private Boolean desctiverSaisiEnseignant;
	@Column(name = "objectif", length = 250)
	private String objectif;
	@Column(name = "competence", length = 250)
	private String competence;

}