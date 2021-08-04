package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "equiposclientes")
public class Equiposclientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cons", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cons;

    @Column(name = "id_dispo")
    private Integer idDispo;

    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "serial")
    private String serial;

    @Column(name = "placa")
    private String placa;

    @Column(name = "detallesFisicos")
    private String detallesFisicos;

}
