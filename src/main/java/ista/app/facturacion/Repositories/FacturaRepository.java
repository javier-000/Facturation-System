package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<FacturaModel,Long> {

}
