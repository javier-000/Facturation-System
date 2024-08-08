package ista.app.facturacion.Api;

import ista.app.facturacion.Domain.ItemFacturaModel;
import ista.app.facturacion.Infrastructure.FacturaRepository;
import ista.app.facturacion.Infrastructure.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("api/v1/ttem-factura")
public class ItemFacturaController {

    private ItemFacturaRepository _repository;

    @Autowired
    public ItemFacturaController(ItemFacturaRepository repository){
        this._repository = repository;
    }

    @PostMapping("save")
    public ItemFacturaModel postFactura(@RequestBody ItemFacturaModel clasificacion) {
        return _repository.save(clasificacion);
    }

    @GetMapping("/get-all")
    private List<ItemFacturaModel> getAllFacturas() {
        return _repository.findAll();
    }

    @GetMapping("/get-by-id/{id}")
    private ResponseEntity<ItemFacturaModel> getById(@PathVariable long id) {
        ItemFacturaModel  list = _repository.findById(id).get();
        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/delete-by-id/{id}")
    private  ResponseEntity<Boolean> deleteById(@PathVariable long id) {
        _repository.deleteById(id);
        return ResponseEntity.ok(true);
    }

    @PutMapping("update")
    public ItemFacturaModel update(@RequestBody ItemFacturaModel clasificacion) {
        return _repository.save(clasificacion);
    }


}
