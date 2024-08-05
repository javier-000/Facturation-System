package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.model.Clasification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/clasification")
public class ClasificationController extends GenericController<Clasification, Integer> {

    private IClasificationService _service;

    @Autowired
    public ClasificationController(IClasificationService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Clasification, Integer> getService() {
        return _service;
    }
}