package dz.mesrs.progres.rest.modal.examen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.lmd.RattachementMc;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name = "examen_session", schema = "fve_examen")
public class ExamenSession implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private long id;
	@ManyToOne
	@JoinColumn(name = "id_rattachement_mc", nullable = false)
	private RattachementMc rattachementMc;
	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne
	@JoinColumn(name = "id_planning_session", nullable = false)
	private PlanningSession planningSession;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_examen", nullable = false, length = 13)

	private Date dateExamen;
	@Temporal(TemporalType.TIME)
	@Column(name = "heure_debut", nullable = false, length = 15)
	private Date heureDebut;
	@Temporal(TemporalType.TIME)
	@Column(name = "heure_fin", length = 15)
	private Date heureFin;
	@Column(name = "duree", nullable = false)
	private int duree;
	@Column(name = "anonymat")
	private Boolean anonymat;
	@Column(name = "note_gere_enseignant")
	private Boolean noteGereParEnseignant;
	private Date heureDebutReelle;
	@Temporal(TemporalType.TIME)
	@Column(name = "heure_fin_reelle", length = 15)
	private Date heureFinReelle;
	@Column(name = "incident")
	private String incident;
	@Column(name = "nb_copie_remises")
	private Integer nbCopieRemises;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_creation", length = 35)
	private Date dateCreation;
	@Column(name = "ref_mode_inscription")
	private String refModeInscription;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_examen_reelle", length = 13)
	private Date dateExamenReelle;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examenSession", cascade = CascadeType.ALL)
	@Getter(onMethod_=@JsonIgnore)
	private List<SalleExamen> salleExamens;
	@Column(name = "moyenne_session")
	private double moyenneSession;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_type_examen")
	public Nomenclature ncTypeExamen;





}
