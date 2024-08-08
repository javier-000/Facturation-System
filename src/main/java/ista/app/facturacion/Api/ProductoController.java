package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.ProductoModel;
import ista.app.facturacion.Infrastructure.PersonaRepository;
import ista.app.facturacion.Infrastructure.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/producto")
public class ProductoController {

    private ProductoRepository _repository;

    @Autowired
    public ProductoController(ProductoRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public ProductoModel postFactura(@RequestBody ProductoModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ProductoModel> getAllFacturas() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<ProductoModel> getById(@PathVariable long id) {
        ProductoModel  list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public ProductoModel update(@RequestBody ProductoModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
