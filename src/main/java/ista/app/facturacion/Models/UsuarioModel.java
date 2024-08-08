package ista.app.facturacion.Models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column(nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String contrasenaUsuario;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaModel personaUsuario;

    @OneToMany(mappedBy = "usuario_rol", cascade = CascadeType.ALL)
    private List<UsuarioRolModel> listRolesUser;

    public PersonaModel getPersonaUsuario() {
        return personaUsuario;
    }

}
