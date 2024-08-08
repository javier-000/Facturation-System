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

    private ClasificacionRepository _repository;

    @Autowired
    public ClasificacionController(ClasificacionRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public ClasificacionModel postClasificacion(@RequestBody ClasificacionModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @PutMapping("update")
    public ClasificacionModel update(@RequestBody ClasificacionModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ClasificacionModel> getAllClasificacion() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private  ResponseEntity<ClasificacionModel> getById(@PathVariable long id) {
        ClasificacionModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }
}
