package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.ItemFacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemFacturaRepository extends JpaRepository<ItemFacturaModel,Long> {
}