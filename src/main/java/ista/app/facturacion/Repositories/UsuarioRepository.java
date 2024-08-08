package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    UsuarioModel findByNombreUsuarioAndContrasenaUsuario(String nombreUsuario, String contrasenaUsuario);
    Boolean existsUsuarioModelByPersonaUsuarioDni(String dni);
}

