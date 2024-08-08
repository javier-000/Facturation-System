package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "factura")
public class FacturaModel {

    //columns of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;
    @Column(nullable = false)
    private String ruc;
    @Column(nullable = false)
    private Date fecha;
    @Column(nullable = false)
    private Double descuento;
    @Column(nullable = false)
    private Double total;

    @OneToMany(mappedBy = "factura_item", cascade = CascadeType.ALL)
    private List<ItemFacturaModel> items_factura;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago")
    private TipoPagoModel tipo_pago_factura;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModel persona_factura;





}
