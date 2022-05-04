package dz.mesrs.progres.rest.modal.lmd;


import dz.mesrs.progres.rest.modal.Nomenclature;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "ue", schema = "lmd")
public class UniteEnseignement {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private Integer id;
	@Column(name = "code", unique = true, nullable = false, length = 50)
	private String code;
	@Column(name = "libelle_fr", nullable = false, length = 150)
	private String libelleFr;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_nature", nullable = false)
	private Nomenclature ncNatureUe;
}