package dz.mesrs.progres.rest.modal.examen;

// Generated 29 sept. 2014 16:32:23 by Hibernate Tools 3.6.0

import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.examen.EvaluationControleContinu;
import dz.mesrs.progres.rest.modal.groupe.AffectationGroupePedagogique;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "note_evaluation_controle_continu", schema = "fve_examen")
public class NoteEvaluationControleContinu {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evaluation_controle_continu")
	private EvaluationControleContinu evaluationControleContinu;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nc_type_appreciation")
	private Nomenclature nomenclature;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_affectation_gp")
	private AffectationGroupePedagogique affectationGroupePedagogique;
	@Column(name = "note", precision = 17, scale = 17)
	private Double note;
	@Column(name = "absent")
	private Boolean absent;
	@Column(name = "note_acquise_doublant")
	private Boolean noteAcquiseDoublant;
	@Column(name = "observation", length = 500)
	private String observation;

}