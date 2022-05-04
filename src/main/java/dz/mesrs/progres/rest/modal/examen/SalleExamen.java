package dz.mesrs.progres.rest.modal.examen;

// Generated 14 oct. 2014 15:28:53 by Hibernate Tools 3.6.0

import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.examen.ExamenSession;
import dz.mesrs.progres.rest.modal.examen.InscriptionExamen;
import dz.mesrs.progres.rest.modal.examen.ResponsableExamen;
import dz.mesrs.progres.rest.modal.ppm.RefLieu;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "salle_examen", schema = "fve_examen")
public class SalleExamen implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_lieu")
	private RefLieu refLieu;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_examen")
	@Getter(onMethod_=@JsonIgnore)
	private ExamenSession examenSession;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salleExamen", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<InscriptionExamen> inscriptionExamens;
	@Getter(onMethod_=@JsonIgnore)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salleExamen", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<ResponsableExamen> responsableExamens;

}
