package ista.app.facturacion.Controllers;

import ista.app.facturacion.Models.ItemFacturaModel;
import ista.app.facturacion.Models.RolCompetenciaModel;
import ista.app.facturacion.Repositories.RolCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/RolCompetencia")
public class RolCompetenciaController {


    @Autowired
    private RolCompetenciaRepository rolCompetenciaRepository;

    @PostMapping("save")
    public RolCompetenciaModel postFactura(@RequestBody RolCompetenciaModel clasificacion) {
        return rolCompetenciaRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<RolCompetenciaModel> getAllFacturas() {
        return rolCompetenciaRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<RolCompetenciaModel> getById(@PathVariable long id) {
        RolCompetenciaModel  list = rolCompetenciaRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        rolCompetenciaRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public RolCompetenciaModel update(@RequestBody RolCompetenciaModel clasificacion) {
        return rolCompetenciaRepository.save(clasificacion);
    }
}
