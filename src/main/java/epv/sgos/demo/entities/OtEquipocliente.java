package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "ot_equipocliente")
public class OtEquipocliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cons", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cons;

    @Column(name = "id_equipo")
    private Integer idEquipo;

    @Column(name = "id_ot")
    private Integer idOt;

    @Column(name = "Observaciones")
    private String observaciones;

}
