package ista.app.facturacion.Domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario_rol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario_rol;
    @Column(nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioModel usuario_rol;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolModel rol_usuario;

}
