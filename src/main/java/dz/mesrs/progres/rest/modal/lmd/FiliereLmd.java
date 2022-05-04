package dz.mesrs.progres.rest.modal.lmd;

import dz.mesrs.progres.rest.modal.lmd.DomaineLMD;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "filiere_lmd", schema = "lmd")
public class FiliereLmd implements java.io.Serializable {


	@Id
	@Column(name = "id", insertable=false, updatable=false)
	private int id;
	@Column(name = "identifiant", unique = true, nullable = false, length = 50)
	private String identifiant;
	@ManyToOne
	@JoinColumn(name = "domainelmd", nullable = false)
	private DomaineLMD domaineLMD;
	@Column(name = "ll_filiere_arabe", length = 500, nullable = false)
	private String llFiliereArabe;
	@Column(name = "ll_filiere", length = 500, nullable = false)
	private String llFiliere;
	}