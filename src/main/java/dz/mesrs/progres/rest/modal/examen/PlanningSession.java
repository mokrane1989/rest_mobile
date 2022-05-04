package dz.mesrs.progres.rest.modal.examen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import dz.mesrs.progres.rest.modal.lmd.Niveau;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Data
@Entity
@Table(name = "planning_session", schema = "fve_examen")
public class PlanningSession implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_periode", nullable = false)
	//@Getter(onMethod_=@JsonIgnore)
	private Periode periode;

	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_annee_academique", nullable = false)
	private AnneeAcademique anneeAcademique;

	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ouverture_offre", nullable = false)
	private OuvertureOffreFormation ouvertureOffreFormation;

	@ManyToOne
	@JoinColumn(name = "id_niveau", nullable = false)
	@Getter(onMethod_=@JsonIgnore)
	private Niveau niveau;
	@Column(name = "intitule", nullable = false)
	private String intitule;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_debut", nullable = false, length = 13)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_fin", nullable = false, length = 13)
	private Date dateFin;
	@Column(name = "numero_session", nullable = false)
	private Integer numeroSession;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_creation", length = 35)
	private Date dateCreation;
	@Column(name = "date_publication", length = 35)
	private Date datePublication;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_cloture", length = 35)
	private Date dateCloture;
	@Column(name = "avec_controle_continu")
	private Boolean avecControleContinu;
	@Column(name = "avec_controle_intermediaire")
	private Boolean avecControleIntermediaire;
	@Column(name = "notes_valide")
	private Boolean notesValide;
	@Column(name = "coefficient")
	private Double coefficient;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_session_a_remplacer")
	@Getter(onMethod_=@JsonIgnore)
	private PlanningSession sessionARemplacer;
	@OneToMany( mappedBy = "planningSession")
	@Getter(onMethod_ = @JsonIgnore)
	private Set<ExamenSession> examenSessions = new HashSet<ExamenSession>(0);
	@Column(name = "coefficient_note_eliminatoire")
	private Double coefficientNoteEliminatoire;

	@ManyToOne
	@JoinColumn(name = "id_nc_type_session")
	public Nomenclature ncTypeSession;


}
