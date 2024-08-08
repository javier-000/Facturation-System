package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "competencia")
public class CompetenciaModel {

    //columns of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_competencia;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "competencia", cascade = CascadeType.ALL)
    private List<RolCompetenciaModel> roles_competencia;

}
