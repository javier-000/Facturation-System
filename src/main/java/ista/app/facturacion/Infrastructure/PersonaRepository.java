package ista.app.facturacion.Infrastructure;

import ista.app.facturacion.Domain.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel,Long> {
    PersonaModel findAllByDni(String dni);
    PersonaModel findAllByNombre(String dni);
    Boolean existsPersonaModelByDni(String dni);
}

