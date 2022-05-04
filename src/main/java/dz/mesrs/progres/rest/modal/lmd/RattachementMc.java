package dz.mesrs.progres.rest.modal.lmd;


import dz.mesrs.progres.rest.modal.lmd.MatiereConstitutive;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "rattachement_mc", schema = "lmd")
public class RattachementMc {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_mc", nullable = false)
	private MatiereConstitutive matiereConstitutive;
	@Column(name = "coefficient", precision = 17, scale = 17)
	private Double coefficient;
	@Column(name = "credit")
	private Double credit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ue", nullable = false)
	public UniteEnseignement uniteEnseignement;

}