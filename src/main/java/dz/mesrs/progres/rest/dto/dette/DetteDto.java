/*
 * k.kezzar Mesrs 2018
 */

package dz.mesrs.progres.rest.dto.dette;
import dz.mesrs.progres.rest.dto.cursus.DossierInscriptionAdministrativeDto;
import dz.mesrs.progres.rest.dto.examen.BilanMcDto;
import dz.mesrs.progres.rest.dto.examen.BilanSessionDto;
import dz.mesrs.progres.rest.dto.examen.BilanUeDto;
import dz.mesrs.progres.rest.dto.lmd.AnneeAcademiqueDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by k.kezzar on 11/12/2019.
 */
@Data
public class DetteDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
   private DossierInscriptionAdministrativeDto diaDto;

    //Année academique
    private AnneeAcademiqueDto anneeAcademiqueDto;
    private AnneeAcademiqueDto anneeAcademiqueDetteDto;
//bilans
    private BilanSessionDto bilanSessionDto;
    private BilanUeDto bilanUeDto;
    private BilanMcDto bilanMcDto;

    private Boolean isDette;
    private Boolean detteAcquise;

    private Double coefficientControleContinuDette;
    private Double coefficientExamenDette;
    private Double coefficientControleIntermediaireDette;

    private Double noteExamenDette;
    private Double noteControleContinuDette;
    private Double noteControleIntermediaireDette;

    private Double moyenneMcDette;
    private Double CreditAcquisMcDette;

    private Double moyenneUeDette;
    private Integer creditAquisUeDette;

    private Double moyenneSessionDette;
    private Double creditAquisSessionDette;

    private Double moyenneAnnuelDette;
    private Double creditAquisAnnuelDette;

    private Boolean sessionNormale;




}
