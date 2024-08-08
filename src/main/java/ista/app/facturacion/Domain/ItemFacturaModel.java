package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item_factura")
public class ItemFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item_factura;
    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false)
    private Double precio;
    @Column(nullable = false)
    private Double sub_total;

    @ManyToOne
    @JoinColumn(name = "id_factura")
    private FacturaModel factura_item;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoModel producto_item;
}
