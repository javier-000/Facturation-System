package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.RolCompetenciaModel;
import ista.app.facturacion.Infrastructure.ProveedorRepository;
import ista.app.facturacion.Infrastructure.RolCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/rol-competencia")
public class RolCompetenciaController {
    private RolCompetenciaRepository _repository;

    @Autowired
    public RolCompetenciaController(RolCompetenciaRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public RolCompetenciaModel postFactura(@RequestBody RolCompetenciaModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<RolCompetenciaModel> getAllFacturas() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<RolCompetenciaModel> getById(@PathVariable long id) {
        RolCompetenciaModel  list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public RolCompetenciaModel update(@RequestBody RolCompetenciaModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
