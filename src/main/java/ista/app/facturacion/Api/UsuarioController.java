package ista.app.facturacion.Api;


import ista.app.facturacion.Domain.UsuarioModel;
import ista.app.facturacion.Infrastructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("save")
    public UsuarioModel postClasificacion(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/get-all")
    private List<UsuarioModel> getAllClasificacion() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<UsuarioModel> getById(@PathVariable long id) {
        UsuarioModel list = usuarioRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }


    @GetMapping("/verify-exists/{nombre}/{clave}`")
    private ResponseEntity<Boolean> getById(@PathVariable String nombre, @PathVariable String clave) {
        UsuarioModel list = usuarioRepository.findByNombreUsuarioAndContrasenaUsuario(nombre,clave);
        if(list!=null) return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        usuarioRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public UsuarioModel update(@RequestBody UsuarioModel clasificacion) {
        return usuarioRepository.save(clasificacion);
    }
}
