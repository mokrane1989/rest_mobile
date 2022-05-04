package dz.mesrs.progres.rest.modal.examen;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
//@RedisHash("Student")
@Data
@Entity
@Table(name = "inscription_examen", schema = "fve_examen")
public class InscriptionExamen  {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private long id;


	@ManyToOne
	@JoinColumn(name = "id_salle_examen")
	private SalleExamen salleExamen;
	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dossier_inscription_administrative", nullable = false)
	private DossierInscriptionAdministrative dossierInscriptionAdministrative;

	@Column(name = "absent")
	private Boolean absent;

	@Column(name = "absence_justifie")
	private Boolean absenceJustifie;

	@Column(name = "motif_absence")
	private String motifAbsence;

	@Column(name = "note_acquise_doublant")
	private Boolean noteAcquiseDoublant;

	@Column(name = "exclu")
	private Boolean exclu;

	@Column(name = "conge")
	private Boolean conge;

	@Column(name = "copie_non_remise")
	private Boolean copieNonRemise;

	@Column(name = "note_examen", precision = 17, scale = 17)
	private Double noteExamen;

	@Column(name = "note_jury", precision = 17, scale = 17)
	private Double noteJury;

	@Column(name = "moyenne_cc", precision = 17, scale = 17)
	private Double moyenneControleContinu;

	@Column(name = "moyenne_generale", precision = 17, scale = 17)
	private Double moyenneGenerale;


	@ManyToOne
	@JoinColumn(name = "id_examen")
	public ExamenSession examenSession;

}