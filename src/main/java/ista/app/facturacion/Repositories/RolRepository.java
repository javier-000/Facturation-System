package ista.app.facturacion.Repositories;

import ista.app.facturacion.Models.ProveedorModel;
import ista.app.facturacion.Models.RolModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<RolModel,Long> {

    /*
    @Query("SELECT u FROM rol u WHERE u.nombre_rol = :nombre_rol")
    RolModel siExiste(String nombre_rol);

    */

    RolModel findByNombreRol(String rol);
    RolModel findByEstado(Boolean rol);
}
