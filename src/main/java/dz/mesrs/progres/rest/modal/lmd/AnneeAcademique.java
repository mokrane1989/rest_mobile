package dz.mesrs.progres.rest.modal.lmd;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "annee_academique", schema = "lmd")
public class AnneeAcademique implements java.io.Serializable {


	@Id
	@Column(name = "id",insertable=false, updatable=false)
	private int id;
	@Column(name = "premiere_annee", nullable = false)
	private short premiereAnnee;
	@Column(name = "deuxieme_annee", nullable = false)
	private short deuxiemeAnnee;

	@Column(name = "est_annee_en_cours", nullable = false)
	private Boolean estAnneeAcademiqueEncours;

	@Column(name = "rang")
	private Integer rang;
@Transient
	public String getCode(){
		return premiereAnnee+" / "+deuxiemeAnnee;
	}
	}