package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.TipoPagoModel;
import ista.app.facturacion.Infrastructure.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/TipoPago")
public class TipoPagoController {


    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @PostMapping("save")
    public TipoPagoModel postClasificacion(@RequestBody TipoPagoModel clasificacion) {
        return tipoPagoRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<TipoPagoModel> getAllClasificacion() {
        return tipoPagoRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<TipoPagoModel> getById(@PathVariable long id) {
        TipoPagoModel list = tipoPagoRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        tipoPagoRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public TipoPagoModel update(@RequestBody TipoPagoModel clasificacion) {
        return tipoPagoRepository.save(clasificacion);
    }
}
