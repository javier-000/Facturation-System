package ista.app.facturacion.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rol_compentencia")
public class RolCompetenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol_competencia;
    @Column(nullable = false)
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_competencia")
    private CompetenciaModel competencia;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolModel rol;


}
