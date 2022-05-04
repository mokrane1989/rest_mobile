package dz.mesrs.progres.rest.dto.lmd;

import lombok.*;

import java.util.Date;

@Data
public class AnneeAcademiqueDto implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private int id;

	private Short premiereAnnee;
	private Short deuxiemeAnnee;
	private String code;
	private Date dateDebut;
	private Date dateFin;
	private Short semaineDebut;
	private Short semaineFin;
	private Boolean valid;
	
	private String libelle;

	private void updateLibelle(){
		StringBuffer sb = new StringBuffer();
		libelle = sb.append(premiereAnnee).append("/").append(deuxiemeAnnee).toString();
	}

}