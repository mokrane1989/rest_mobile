package dz.mesrs.progres.rest.modal.lmd;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.Nomenclature;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ap", schema = "lmd")
public class AtomePedagogique implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_matiere_constitutive")
	private MatiereConstitutive matiereConstitutive;
	@Column(name = "code", nullable = false, length = 10, unique = true)
	private String code;
	@Column(name = "volume_horaire", precision = 17, scale = 17, nullable = false)
	private Double volumeHoraire;
	@Column(name = "seuil", precision = 17, scale = 17)
	private Double seuil;
	@Column(name = "pourcentage_evaluation", precision = 17, scale = 17)
	private Double pourcentage;
	@Column(name = "groupes_prevus")
	private Integer groupesPrevus;
	@ManyToOne
	@JoinColumn(name = "id_nc_type_ap")
	private Nomenclature ncTypeAp;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_nc_mode_enseignement")
	@Getter(onMethod_=@JsonIgnore)
	private Nomenclature ncModeEnseignementAp;

}
