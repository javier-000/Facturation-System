package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "rol")
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    @Column(nullable = false)
    private String nombreRol;
    @Column(nullable = false)
    private Boolean estado;


    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private List<RolCompetenciaModel> roles_competencia_rol;

    @OneToMany(mappedBy = "rol_usuario", cascade = CascadeType.ALL)
    private List<UsuarioRolModel> list_roles_user;
}
