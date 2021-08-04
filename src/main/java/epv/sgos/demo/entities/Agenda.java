package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "agenda")
public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cons", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cons;

    @Column(name = "fecha_reg", nullable = false)
    private Date fechaReg;

    @Column(name = "id_ot", nullable = false)
    private Integer idOt;

    @Column(name = "id_pro", nullable = false)
    private Integer idPro;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "estado_act", nullable = false)
    private String estadoAct;

    @Column(name = "prioridad", nullable = false)
    private String prioridad;

}
