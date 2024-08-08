package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.PersonaModel;
import ista.app.facturacion.Infrastructure.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/persona")
public class PersonaController {
    private PersonaRepository _repository;

    @Autowired
    public PersonaController(PersonaRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public PersonaModel postFactura(@RequestBody PersonaModel person) {
        if (person.getDni() == null || person.getDni().isEmpty() ) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "dni-is-required");
        }

        if (_repository.existsPersonaModelByDni(person.getDni())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El usuario con este DNI ya existe.");
        }
        return _repository.save(person);
    }

    @GetMapping("/get-all")
    private List<PersonaModel> getAllFacturas() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<PersonaModel> getById(@PathVariable long id) {
        PersonaModel  list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/get-by-dni/{dni}")
    private ResponseEntity<PersonaModel> getPerssonaByDni(@PathVariable String dni) {
        PersonaModel  list = _repository.findAllByDni(dni);
        if(list!= null) return ResponseEntity.ok(list);
        return  ResponseEntity.ok(null);
    }
    @GetMapping("/get-by-names/{names}")
    private ResponseEntity<PersonaModel> getPerssonaByNames(@PathVariable String names) {
        PersonaModel  list = _repository.findAllByNombre(names);
        if(list!= null) return ResponseEntity.ok(list);
        return  ResponseEntity.ok(null);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public PersonaModel update(@RequestBody PersonaModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
