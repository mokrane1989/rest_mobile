
package dz.mesrs.progres.rest.modal.examen;

import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import dz.mesrs.progres.rest.modal.lmd.Periode;
import dz.mesrs.progres.rest.modal.lmd.RattachementMc;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coefficient_examen", schema = "fve_examen")
public class CoefficientExamen implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_oof", nullable = false)
	private OuvertureOffreFormation ouvertureOffreFormation;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_periode", nullable = false)
	private Periode periode;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_rattachement_mc", nullable = false)
	private RattachementMc rattachementMc;
	@Column(name = "coefficient_examen", nullable = false)
	private double coefficientExamen;
	@Column(name = "coefficient_controle_continu", nullable = false)
	private double coefficientControleContinu;
	@Column(name = "coefficient_controle_intermediaire", nullable = false)
	private double coefficientControleIntermediaire;

}