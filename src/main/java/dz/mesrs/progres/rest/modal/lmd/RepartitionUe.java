package dz.mesrs.progres.rest.modal.lmd;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "repartition_ue", schema = "lmd")
public class RepartitionUe {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_unite_enseignement", nullable = false)
	private UniteEnseignement uniteEnseignement;

	@Column(name = "coefficient", precision = 17, scale = 17)
	private Double coefficient;

	@Column(name = "ref_code_semestre")
	private String refCodeSemestre;


	@Column(name = "note_obtension", precision = 17, scale = 17)
	private Double noteObtension;
	@Column(name = "note_de_base", precision = 17, scale = 17)
	private Double noteDeBase;
	@Column(name = "note_eliminatoire", precision = 17, scale = 17)
	private Double noteEliminatoire;

	@Column(name = "optionnelle")
	private Boolean optionnelle;
	@Column(name = "a_choix")
	private Boolean aChoix;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_periode")
	private Periode periode;

	@Column(name = "nb_seances")
	private Integer nbSeances;

	@Column(name = "volume_horaire")
	private Double volumeHoraire;





}