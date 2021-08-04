package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "servicios")
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_act", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAct;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo_servicio")
    private String tipoServicio;

    @Column(name = "subcategoria")
    private String subcategoria;

    @Column(name = "valor")
    private Double valor;

}
