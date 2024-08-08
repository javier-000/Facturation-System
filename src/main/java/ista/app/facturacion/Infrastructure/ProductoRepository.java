package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel,Long> {

}
