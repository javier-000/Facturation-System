package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.UsuarioRolModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRolModel,Long> {
}
