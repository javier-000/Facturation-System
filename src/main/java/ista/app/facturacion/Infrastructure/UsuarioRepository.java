package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    UsuarioModel findByNombreUsuarioAndContrasenaUsuario(String nombreUsuario, String contrasenaUsuario);
    Boolean existsUsuarioModelByPersonaUsuarioDni(String dni);
}

