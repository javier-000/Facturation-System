package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.ClasificacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<ClasificacionModel,Long> {
}
