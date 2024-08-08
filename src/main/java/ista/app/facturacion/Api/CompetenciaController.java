package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.CompetenciaModel;
import ista.app.facturacion.Infrastructure.ClasificacionRepository;
import ista.app.facturacion.Infrastructure.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/competencia")
public class CompetenciaController {

    private CompetenciaRepository _repository;

    @Autowired
    public CompetenciaController(CompetenciaRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public CompetenciaModel postCompetencia(@RequestBody CompetenciaModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<CompetenciaModel> getAllCompetencias() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<CompetenciaModel> getById(@PathVariable long id) {
        CompetenciaModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/get-by-competence/{competence}")
    private ResponseEntity<Boolean> getById(@PathVariable String competence) {
        CompetenciaModel list = _repository.findByNombre(competence);
        if(list!=null) return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public CompetenciaModel update(@RequestBody CompetenciaModel clasificacion) {
        return _repository.save(clasificacion);
    }

}
