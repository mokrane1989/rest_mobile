package dz.mesrs.progres.rest.modal.lmd;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "domaine_lmd", schema = "lmd")
public class DomaineLMD implements java.io.Serializable {

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private int id;
	@Column(name = "identifiant", unique = true, nullable = false, length = 50)
	private String identifiant;
	@Column(name = "ll_domaine", unique = true, nullable = false, length = 50)
	private String llDomaine;
	@Column(name = "ll_domaine_arabe", unique = true, nullable = false, length = 50)
	private String llDomaineArabe;
}