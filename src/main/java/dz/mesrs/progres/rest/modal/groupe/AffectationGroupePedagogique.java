package dz.mesrs.progres.rest.modal.groupe;

// Generated 15 juil. 2014 16:41:51 by Hibernate Tools 3.6.0


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.cursus.DossierInscriptionAdministrative;
import lombok.Data;
import lombok.Getter;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.util.Date;

@ComponentScan
@Data
@Entity
@Table(name = "affectation_groupe_pedagogique", schema = "cursus", uniqueConstraints = @UniqueConstraint(columnNames = {
		"groupe_pedagogique", "dossier_inscription" }))
public class AffectationGroupePedagogique implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dossier_inscription", nullable = false)
	@Getter(onMethod_=@JsonIgnore)
	private DossierInscriptionAdministrative dossierInscriptionAdministrative;
	@ManyToOne
	@JoinColumn(name = "groupe_pedagogique", nullable = false)
	private GroupePedagogique groupePedagogique;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_affectation", length = 13)
	private Date dateAffectation;
}