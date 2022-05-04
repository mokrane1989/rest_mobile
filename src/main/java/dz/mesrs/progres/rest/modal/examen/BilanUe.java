package dz.mesrs.progres.rest.modal.examen;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dz.mesrs.progres.rest.modal.lmd.RepartitionUe;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "bilan_ue", schema = "fve_examen")
public class BilanUe implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	private long id;
	@Getter(onMethod_=@JsonIgnore)
	@ManyToOne
	@JoinColumn(name = "id_bilan_session", nullable = false)
	private BilanSession bilanSession;
    @ManyToOne
	@JoinColumn(name = "id_repartition_ue", nullable = false)
	private RepartitionUe repartitionUe;
   @OneToMany(mappedBy = "bilanUe", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<BilanMc> bilanMcs = new ArrayList<>();
	@Column(name = "moyenne")
	private Double moyenne;
	@Column(name = "coefficient")
	private Double coefficient;
	@Column(name = "credit")
	private Double credit;
	@Column(name = "credit_obtenu")
	private Double creditObtenu;
	@Column(name = "credit_acquis")
	private Double creditAcquis;


}