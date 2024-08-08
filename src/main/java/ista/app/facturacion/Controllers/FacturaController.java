package ista.app.facturacion.Controllers;

import ista.app.facturacion.Models.CompetenciaModel;
import ista.app.facturacion.Models.FacturaModel;
import ista.app.facturacion.Repositories.CompetenciaRepository;
import ista.app.facturacion.Repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/Factura")
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
