package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "marcas")
public class Marcas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cod_marc", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codMarc;

    @Column(name = "nombre")
    private String nombre;

}
