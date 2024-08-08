package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.FacturaModel;
import ista.app.facturacion.Infrastructure.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/factura")
public class FacturaController {
    @Autowired
    private FacturaRepository facturaRepository;


    @PostMapping("save")
    public FacturaModel postFactura(@RequestBody FacturaModel clasificacion) {
        return facturaRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<FacturaModel> getById(@PathVariable long id) {
        FacturaModel list = facturaRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        facturaRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public FacturaModel update(@RequestBody FacturaModel clasificacion) {
        return facturaRepository.save(clasificacion);
    }

}
