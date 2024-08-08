package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.PersonaModel;
import ista.app.facturacion.Models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel,Long> {

}
