package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "ordentrabajo")
public class Ordentrabajo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Consecutivo de la ot
     */
    @Id
    @Column(name = "cons_ot", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consOt;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "solicitud", nullable = false)
    private String solicitud;

    @Column(name = "estado_proce", nullable = false)
    private String estadoProce;

    @Column(name = "fecha_entrega")
    private Date fechaEntrega;

    @Column(name = "usuario")
    private String usuario;

}
