package ista.app.facturacion.Controllers;

import ista.app.facturacion.Models.ClasificacionModel;
import ista.app.facturacion.Repositories.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/Clasificacion")
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
