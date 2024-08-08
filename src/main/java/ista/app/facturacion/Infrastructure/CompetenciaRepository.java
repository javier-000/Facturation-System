package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.CompetenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenciaRepository extends JpaRepository<CompetenciaModel,Long> {

    /*
    @Query("SELECT u FROM competencia u WHERE u.nombre = :nombre")
    CompetenciaModel siExisteComp(String nombre);*/

    CompetenciaModel findByNombre(String nombre);
}
