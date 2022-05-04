
package dz.mesrs.progres.rest.modal.examen;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.lmd.RattachementMc;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
@Data
@Entity
@Table(name = "bilan_mc", schema = "fve_examen")
public class BilanMc implements java.io.Serializable {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private long id;
	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne
	@JoinColumn(name = "id_bilan_ue", nullable = false)
	private BilanUe bilanUe;
	@ManyToOne
	@JoinColumn(name = "id_rattachement_mc", nullable = false)
	private RattachementMc rattachementMc;
	@Column(name = "moyenne_cc")
	private Double moyenneControleContinu;
	@Column(name = "note_controle_intermediaire")
	private Double noteControleIntermediaire;
	@Column(name = "credit")
	private Double credit;
	@Column(name = "credit_obtenu")
	private Double creditObtenu;
	@Column(name = "credit_acquis")
	private Double creditAcquis;
	@Column(name = "coefficient")
	private Double coefficient;
	@Column(name = "coefficient_cc")
	private Double coefficientControleContinu;
	@Column(name = "coefficient_examen")
	private Double coefficientExamen;
	@Column(name = "coefficient_controle_intermediaire")
	private Double coefficientControleIntermediaire;
	@Column(name = "note_examen")
	private Double noteExamen;
	@Column(name = "note_jury")
	private Double noteJury;
	@Column(name = "moyenne_generale")
	private Double moyenneGenerale;
	@Column(name = "dette")
	private Boolean dette;
	@Column(name = "session_normal")
	private Boolean sessionNormale;
	@Column(name = "note_eliminatoire")
	private Double noteEliminatoire;
	@Column(name = "est_rachete")
	private Boolean estRachete;
	@Column(name = "exclue")
	private Boolean exclue;
}