package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.ClasificacionModel;
import ista.app.facturacion.Infrastructure.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/clasificacion")
public class ClasificacionController {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    @PostMapping("save")
    public ClasificacionModel postClasificacion(@RequestBody ClasificacionModel clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @PutMapping("update")
    public ClasificacionModel update(@RequestBody ClasificacionModel clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ClasificacionModel> getAllClasificacion() {
        return clasificacionRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private  ResponseEntity<ClasificacionModel> getById(@PathVariable long id) {
        ClasificacionModel list = clasificacionRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        clasificacionRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }
}
