package dz.mesrs.progres.rest.modal.examen;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "bilan_session", schema = "fve_examen")
public class BilanSession {


	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Long id;
	@Column(name = "type")
	private int type;
	@Column(name = "annuel")
	private Boolean annuel;

	@ManyToOne
	@JoinColumn(name = "id_oof", nullable = false)
	@Getter(onMethod_=@JsonIgnore)
	private OuvertureOffreFormation oof;
	@ManyToOne
	@JoinColumn(name = "id_periode", nullable = false)
	private Periode periode;
	@OneToMany(mappedBy = "bilanSession", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<BilanUe> bilanUes = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "id_dossier_inscription", nullable = false)
	@Getter(onMethod_=@JsonIgnore)
	private DossierInscriptionAdministrative dossierInscriptionAdministrative;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nc_decision", nullable = true)
	private Nomenclature typeDecision;

	@Column(name = "moyenne")
	private Double moyenne;

	@Column(name = "moyenne_sn")
	private Double moyenneSn;

	@Column(name = "credit")
	private Double credit;

	@Column(name = "credit_obtenu")
	private Double creditObtenu;

	@Column(name = "credit_acquis")
	private Double creditAcquis;
	@Column(name = "credit_cumul_precedent")
	private Double cumulCreditPrecedent;
	@Column(name = "coefficient")
	private Double coefficient;
}