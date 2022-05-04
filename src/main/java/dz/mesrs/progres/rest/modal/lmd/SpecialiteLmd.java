package dz.mesrs.progres.rest.modal.lmd;


import dz.mesrs.progres.rest.modal.lmd.FiliereLmd;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "specialite_lmd", schema = "lmd")
public class SpecialiteLmd implements java.io.Serializable {


	@Id
	@Column(name = "id", insertable=false, updatable=false)
	private int id;
	@Column(name = "identifiant", unique = true, nullable = false, length = 50)
	private String identifiant;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "filiere", nullable = false)
	private FiliereLmd filiereLmd;

	@Column(name = "ll_specialite_arabe", length = 500, nullable = false)
	private String llSpecialiteArabe;
	@Column(name = "ll_specialite", length = 500, nullable = false)
	private String llSpecialite;
	}