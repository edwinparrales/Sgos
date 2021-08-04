package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "proveedores")
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_prove", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoProve;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "nit")
    private String nit;

    @Column(name = "num_tel", nullable = false)
    private String numTel;

    @Column(name = "num_movil", nullable = false)
    private String numMovil;

    @Column(name = "email")
    private String email;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "ciudad")
    private String ciudad;

}
