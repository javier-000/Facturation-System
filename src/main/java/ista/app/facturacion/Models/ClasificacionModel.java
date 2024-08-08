package ista.app.facturacion.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clasificacion")
public class ClasificacionModel {

    //columns of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_clasificacion;
    @Column(nullable = false)
    private String grupo;

    @OneToMany(mappedBy = "clasificacion_producto", cascade = CascadeType.ALL)
    private List<ProductoModel> productos;

}
