package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "consec", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consec;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "perfil", nullable = false)
    private String perfil;

    @Column(name = "dni_prof")
    private String dniProf;

    @Column(name = "estado", nullable = false)
    private String estado;

}
