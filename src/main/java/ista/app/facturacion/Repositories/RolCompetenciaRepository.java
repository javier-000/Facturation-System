package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.ProveedorModel;
import ista.app.facturacion.Models.RolCompetenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolCompetenciaRepository extends JpaRepository<RolCompetenciaModel,Long> {
}
