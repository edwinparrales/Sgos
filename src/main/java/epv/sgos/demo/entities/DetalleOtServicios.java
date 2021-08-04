package epv.sgos.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "detalle_ot_servicios")
public class DetalleOtServicios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cons", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cons;

    @Column(name = "id_ot")
    private Integer idOt;

    @Column(name = "id_ser")
    private Integer idSer;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "id_dispo")
    private Integer idDispo;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "seriales")
    private String seriales;

    @Column(name = "capacidad")
    private String capacidad;

    @Column(name = "valor_dispositivo")
    private Double valorDispositivo;

    @Column(name = "id_proveedor")
    private Integer idProveedor;

    @Column(name = "num_factura")
    private String numFactura;

    @Column(name = "equipo_cliente")
    private String equipoCliente;

}
