package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.FacturaModel;
import ista.app.facturacion.Infrastructure.CompetenciaRepository;
import ista.app.facturacion.Infrastructure.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/factura")
public class FacturaController {

    private FacturaRepository _repository;

    @Autowired
    public FacturaController(FacturaRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public FacturaModel postFactura(@RequestBody FacturaModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<FacturaModel> getAllFacturas() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<FacturaModel> getById(@PathVariable long id) {
        FacturaModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public FacturaModel update(@RequestBody FacturaModel clasificacion) {
        return _repository.save(clasificacion);
    }

}
