package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "dispositivos")
public class Dispositivos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cons_dispo", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consDispo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo_tec")
    private String tipoTec;

}
