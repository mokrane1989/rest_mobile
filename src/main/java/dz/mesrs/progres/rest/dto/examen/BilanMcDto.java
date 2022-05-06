/**
 * [dz.gov.mesrs.sii.fve.business.model.dto.cursus.BilanMcDto.java]
 *
 * @author MAKERRI Sofiane on : 27 oct. 2014  09:37:45
 */
package dz.mesrs.progres.rest.dto.examen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class BilanMcDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private Long bilanUeId;
    private Long bilanSessionId;
    private Integer rattachementMcId;
    private String mcLibelleFr;
    private String mcLibelleAr;
    private String mcCode;
    private String ueLibelleFr;
    private String ueLibelleAr;
    private String ueCode;
    private Double moyenneControleContinu;
    private Double noteControleIntermediaire;
    private Double coefficient;
    private Double credit;
    private Double creditObtenu;
    private Double creditAcquis;
    private Double coefficientControleContinu;
    private Double coefficientExamen;
    private Double coefficientControleIntermediaire;
    private Double noteExamen;
    private Double noteSession;
    private Double noteJury;
    private Double noteJuryToDisplay;
    private Double moyenneGenerale;
    private Double moyenneGeneralePeriode;
    private Boolean dette;
    private Double mcNoteObtention;
    private Boolean mcAcquis;
    private Boolean withoutControleContinu;
    private Double noteEliminatoire;
    private Boolean estRachete;
    private int totalAquis;
    private int effectif;
    private Double tauxReussite;
    private String pourcentageReussite;
    private Double sommeMoyenne;
    private Double moyennePromo;
    private String effectifTauxReussiteSession1;
    private String effectifTauxReussiteSession2;
    private Double coefficientControleContinuSession1;
    private Double coefficientExamenSession1;
    private Double coefficientControleIntermediaireSession1;
    private Double coefficientControleContinuSession2;
    private Double coefficientExamenSession2;
    private Double coefficientControleIntermediaireSession2;
    private String effectifTauxReussite;
    private int nbrEtudiantAmeliorerNoteSession2; // le nombre d'etuduiant qui
    // ont améliorer leur note
    // dans la deuxiéme session
    private Boolean sessionNormale;
    private Boolean exclue;


}
