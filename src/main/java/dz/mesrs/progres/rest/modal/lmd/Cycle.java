package dz.mesrs.progres.rest.modal.lmd;

// Generated 15 juil. 2014 16:41:51 by Hibernate Tools 3.6.0

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cycle", schema = "lmd")
public class Cycle implements java.io.Serializable {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private int id;
	@Column(name = "code", unique = true, nullable = false, length = 2)
	private String code;
	@Column(name = "libelle_long_lt", unique = true, nullable = false, length = 150)
	private String libelleLongLt;
	@Column(name = "libelle_long_ar", length = 150)
	private String libelleLongAr;
	@Column(name = "rang", nullable = false)
	private int rang;
}