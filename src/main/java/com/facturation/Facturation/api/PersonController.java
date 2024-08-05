package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.application.IPersonService;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/person")
public class PersonController extends GenericController<Person, Integer> {

    private IPersonService _service;

    @Autowired
    public PersonController(IPersonService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Person, Integer> getService() {
        return _service;
    }
}