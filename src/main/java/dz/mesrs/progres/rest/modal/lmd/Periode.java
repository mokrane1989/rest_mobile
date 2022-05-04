package dz.mesrs.progres.rest.modal.lmd;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.lmd.Niveau;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "periode", schema = "lmd")
public class Periode implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_niveau", nullable = false)
	@Getter(onMethod_=@JsonIgnore)
	private Niveau niveau;
	@Column(name = "code", unique = true, nullable = false, length = 5)
	private String code;
	@Column(name = "libelle_long_lt", unique = true, nullable = false, length = 150)
	private String libelleLongLt;
	@Column(name = "libelle_long_ar", unique = true, nullable = false, length = 150)
	private String libelleLongAr;
	@Column(name = "rang")
	private Integer rang;
}