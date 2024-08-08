package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.RolModel;
import ista.app.facturacion.Infrastructure.RolCompetenciaRepository;
import ista.app.facturacion.Infrastructure.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/rol")
public class RolController {
    private RolRepository _repository;

    @Autowired
    public RolController(RolRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public RolModel postClasificacion(@RequestBody RolModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<RolModel> getAllClasificacion() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<RolModel> getById(@PathVariable long id) {
        RolModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/get-by-rol/{rol}")
    private ResponseEntity<Boolean> getById(@PathVariable String rol) {
        RolModel list = _repository.findByNombreRol(rol);
        if(list!=null) return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @GetMapping("/get-by-state/{state}")
    private ResponseEntity<Boolean> getById(@PathVariable Boolean state) {
        RolModel list = _repository.findByEstado(state);
        if(list!=null) return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public RolModel update(@RequestBody RolModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
