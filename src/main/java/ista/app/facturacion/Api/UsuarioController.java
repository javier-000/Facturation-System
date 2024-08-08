package ista.app.facturacion.Api;


import ista.app.facturacion.Domain.UsuarioModel;
import ista.app.facturacion.Infrastructure.TipoPagoRepository;
import ista.app.facturacion.Infrastructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    private UsuarioRepository _repository;

    @Autowired
    public UsuarioController(UsuarioRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public UsuarioModel postClasificacion(@RequestBody UsuarioModel usuario) {
        return _repository.save(usuario);
    }

    @GetMapping("/get-all")
    private List<UsuarioModel> getAllClasificacion() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<UsuarioModel> getById(@PathVariable long id) {
        UsuarioModel list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }


    @GetMapping("/verify-exists/{nombre}/{clave}`")
    private ResponseEntity<Boolean> getById(@PathVariable String nombre, @PathVariable String clave) {
        UsuarioModel list = _repository.findByNombreUsuarioAndContrasenaUsuario(nombre,clave);
        if(list!=null) return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public UsuarioModel update(@RequestBody UsuarioModel clasificacion) {
        return _repository.save(clasificacion);
    }
}
