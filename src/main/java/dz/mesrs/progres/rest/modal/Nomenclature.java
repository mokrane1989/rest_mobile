package dz.mesrs.progres.rest.modal;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nomenclature", schema = "nc")
public class Nomenclature implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id",insertable=false, updatable=false)
	private int id;
	@Column(name = "code")
	private String code;

	@Column(name = "libelle_long_fr", length = 100)
	private String libelleLongFr;
	@Column(name = "libelle_long_ar", length = 100)
	private String libelleLongAr;
	@Column(name = "libelle_court_fr", length = 100)
	private String libelleCourtFr;
	@Column(name = "libelle_court_ar", length = 100)
	private String libelleCourtAr;

}
