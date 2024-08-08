package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.ProveedorModel;
import ista.app.facturacion.Infrastructure.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @PostMapping("save")
    public ProveedorModel postFactura(@RequestBody ProveedorModel clasificacion) {
        return proveedorRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ProveedorModel> getAllFacturas() {
        return proveedorRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<ProveedorModel> getById(@PathVariable long id) {
        ProveedorModel  list = proveedorRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        proveedorRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public ProveedorModel update(@RequestBody ProveedorModel clasificacion) {
        return proveedorRepository.save(clasificacion);
    }
}
