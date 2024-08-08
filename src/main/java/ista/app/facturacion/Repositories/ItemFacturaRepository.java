package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.FacturaModel;
import ista.app.facturacion.Models.ItemFacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemFacturaRepository extends JpaRepository<ItemFacturaModel,Long> {
}
