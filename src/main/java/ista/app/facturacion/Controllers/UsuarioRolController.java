package ista.app.facturacion.Controllers;

import ista.app.facturacion.Models.TipoPagoModel;
import ista.app.facturacion.Models.UsuarioModel;
import ista.app.facturacion.Models.UsuarioRolModel;
import ista.app.facturacion.Repositories.UsuarioRepository;
import ista.app.facturacion.Repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/UsuarioRol")
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
