package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.UsuarioRolModel;
import ista.app.facturacion.Infrastructure.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/usuario-rol")
public class UsuarioRolController {


    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @PostMapping("save")
    public UsuarioRolModel postClasificacion(@RequestBody UsuarioRolModel clasificacion) {
        return usuarioRolRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<UsuarioRolModel> getAllClasificacion() {
        return usuarioRolRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<UsuarioRolModel> getById(@PathVariable long id) {
        UsuarioRolModel list =usuarioRolRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        usuarioRolRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public UsuarioRolModel update(@RequestBody UsuarioRolModel clasificacion) {
        return usuarioRolRepository.save(clasificacion);
    }
}
