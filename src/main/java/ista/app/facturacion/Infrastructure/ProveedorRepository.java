package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.ProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<ProveedorModel,Long> {
}
