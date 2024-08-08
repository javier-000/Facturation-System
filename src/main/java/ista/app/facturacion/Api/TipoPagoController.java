package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.TipoPagoModel;
import ista.app.facturacion.Infrastructure.RolRepository;
import ista.app.facturacion.Infrastructure.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/tipo-pago")
public class TipoPagoController {
    private TipoPagoRepository _repository;

    @Autowired
    public TipoPagoController(TipoPagoRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public TipoPagoModel postClasificacion(@RequestBody TipoPagoModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<TipoPagoModel> getAllClasificacion() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<TipoPagoModel> getById(@PathVariable long id) {
        TipoPagoModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public TipoPagoModel update(@RequestBody TipoPagoModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
