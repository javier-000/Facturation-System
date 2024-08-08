package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.UsuarioRolModel;
import ista.app.facturacion.Infrastructure.UsuarioRepository;
import ista.app.facturacion.Infrastructure.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/usuario-rol")
public class UsuarioRolController {
    private UsuarioRolRepository _repository;

    @Autowired
    public UsuarioRolController(UsuarioRolRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public UsuarioRolModel postClasificacion(@RequestBody UsuarioRolModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<UsuarioRolModel> getAllClasificacion() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<UsuarioRolModel> getById(@PathVariable long id) {
        UsuarioRolModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public UsuarioRolModel update(@RequestBody UsuarioRolModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
