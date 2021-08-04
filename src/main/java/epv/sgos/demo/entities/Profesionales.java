package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "profesionales")
public class Profesionales implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_pro", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPro;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "num_cedula", nullable = false)
    private String numCedula;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "num_tel")
    private String numTel;

    @Column(name = "num_movil")
    private String numMovil;

    @Column(name = "num_tarjeProfe")
    private String numTarjeprofe;

    @Column(name = "cargo", nullable = false)
    private String cargo;

    @Column(name = "email")
    private String email;

    @Column(name = "estado_bd")
    private String estadoBd;

}
