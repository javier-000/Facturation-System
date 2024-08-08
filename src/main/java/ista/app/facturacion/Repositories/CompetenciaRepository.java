package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.ClasificacionModel;
import ista.app.facturacion.Models.CompetenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenciaRepository extends JpaRepository<CompetenciaModel,Long> {

    /*
    @Query("SELECT u FROM competencia u WHERE u.nombre = :nombre")
    CompetenciaModel siExisteComp(String nombre);*/

    CompetenciaModel findByNombre(String nombre);
}
