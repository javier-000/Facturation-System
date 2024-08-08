package ista.app.facturacion.Controllers;

import ista.app.facturacion.Models.ItemFacturaModel;
import ista.app.facturacion.Models.PersonaModel;
import ista.app.facturacion.Models.ProductoModel;
import ista.app.facturacion.Repositories.PersonaRepository;
import ista.app.facturacion.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("api/Producto")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @PostMapping("save")
    public ProductoModel postFactura(@RequestBody ProductoModel clasificacion) {
        return productoRepository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ProductoModel> getAllFacturas() {
        return productoRepository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<ProductoModel> getById(@PathVariable long id) {
        ProductoModel  list = productoRepository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        productoRepository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public ProductoModel update(@RequestBody ProductoModel clasificacion) {
        return productoRepository.save(clasificacion);
    }
}
