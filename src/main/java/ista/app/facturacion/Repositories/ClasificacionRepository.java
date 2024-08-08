package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.ClasificacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<ClasificacionModel,Long> {
}
