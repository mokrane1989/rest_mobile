/*
 * k.kezzar Mesrs 2018
 */

package dz.mesrs.progres.rest.modal.dette;
import dz.mesrs.progres.rest.modal.examen.BilanMc;
import dz.mesrs.progres.rest.modal.groupe.GroupePedagogique;
import dz.mesrs.progres.rest.modal.lmd.AnneeAcademique;
import dz.mesrs.progres.rest.modal.lmd.OuvertureOffreFormation;
import lombok.Data;

import javax.persistence.*;


/**
 * Created by k.kezzar on 11/12/2019.
 */
@Data
@Entity
@Table(name = "bilan_dette", schema= "fve_examen")
public class Dette implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id",insertable=false, updatable=false)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_oof")
    private OuvertureOffreFormation oofActuell;


     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bilan_mc", nullable = false)
    private BilanMc bilanMc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_annee_academique", nullable = false)
    private AnneeAcademique anneeAcademiqueDette;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_groupe_pedagogique", nullable = false)
    private GroupePedagogique groupePedagogique;

    @Column(name = "coefficient_examen")
    private Double coefficientExamenDette;

    @Column(name = "coefficient_cc")
    private Double coefficientControleContinuDette;

    @Column(name = "coefficient_controle_intermediaire")
    private Double coefficientControleIntermediaireDette;



    @Column(name = "note_examen")
    private Double noteExamenDette;

    @Column(name = "note_cc")
    private Double noteControleContinuDette;

    @Column(name = "note_controle_intermediaire")
    private Double noteControleIntermediaireDette;

    @Column(name = "moyenne_mc")
    private Double moyenneMcDette;

    @Column(name = "credit_mc")
    private Double CreditAcquisMcDette;

    @Column(name = "moyenne_ue")
    private Double moyenneUeDette;

    @Column(name = "credit_ue")
    private Double creditAquisUeDette;

    @Column(name = "moyenne_session")
    private Double moyenneSessionDette;

    @Column(name = "credit_session")
    private Double creditAquisSessionDette;


    @Column(name = "moyenne_annuel")
    private Double moyenneAnnuelDette;

    @Column(name = "credit_annuel")
    private Double creditAquisAnnuelDette;


    @Column(name = "dette")
    private Boolean isDette;


    @Column(name = "dette_acquise")
    private Boolean detteAcquise;

    @Column(name = "session_normal")
    private Boolean sessionNormale;






}
