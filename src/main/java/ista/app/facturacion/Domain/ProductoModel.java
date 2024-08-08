package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "producto")
public class ProductoModel {

    //Columns with table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;
    @Column(nullable = false)
    private int stock;
    @Column(nullable = false)
    private Double precio_unitario;
    @Column(nullable = false)
    private String unidad;
    @Column(nullable = false)
    private Boolean iva;

    @ManyToOne
    @JoinColumn(name = "id_clasificacion")
    private ClasificacionModel clasificacion_producto;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private ProveedorModel proveedor_producto;

    @OneToMany(mappedBy = "producto_item", cascade = CascadeType.ALL)
    private List<ItemFacturaModel> items_factura;

}
