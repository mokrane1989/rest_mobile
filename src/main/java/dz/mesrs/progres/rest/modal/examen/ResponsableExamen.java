package dz.mesrs.progres.rest.modal.examen;

// Generated 1 oct. 2014 16:55:50 by Hibernate Tools 3.6.0

import dz.mesrs.progres.rest.modal.ppm.RefIndividu;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "responsable_examen", schema = "fve_examen")
public class ResponsableExamen implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private int id;
	private SalleExamen salleExamen;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_salle_examen")
	private RefIndividu refIndividu;
	@Column(name = "absent")
	private boolean absent;
	@Column(name = "motif_absence")
	private String motifAbsence;

}
