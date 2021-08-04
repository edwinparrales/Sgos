package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_client", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codClient;

    @Column(name = "tipo_dni", nullable = false)
    private String tipoDni;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "num_celular")
    private String numCelular;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "barrio")
    private String barrio;

    @Column(name = "observaciones")
    private String observaciones;

}
