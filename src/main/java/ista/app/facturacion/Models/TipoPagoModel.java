package ista.app.facturacion.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tipo_pago")
public class TipoPagoModel {

    //columns of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_pago;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "tipo_pago_factura", cascade = CascadeType.ALL)
    private List<FacturaModel> facturas;

}
