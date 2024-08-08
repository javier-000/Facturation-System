package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.TipoPagoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPagoRepository extends JpaRepository<TipoPagoModel,Long> {


}
