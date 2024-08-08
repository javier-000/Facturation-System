package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel,Long> {

}
