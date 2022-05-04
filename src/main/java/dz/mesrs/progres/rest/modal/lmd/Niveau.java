package dz.mesrs.progres.rest.modal.lmd;

// Generated 15 juil. 2014 16:41:51 by Hibernate Tools 3.6.0

import dz.mesrs.progres.rest.modal.lmd.Cycle;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "niveau", schema = "lmd")
public class Niveau implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_cycle", nullable = false)
	private Cycle cycle;
	@Column(name = "code", unique = true, nullable = false, length = 2)
	private String code;
	@Column(name = "libelle_long_lt", unique = true, nullable = false, length = 150)
	private String libelleLongLt;
	@Column(name = "libelle_long_ar", unique = true, nullable = false, length = 150)
	private String libelleLongAr;
	@Column(name = "rang")
	private int rang;
	@Column(name = "fin_cycle")
	private Boolean finCycle;
}