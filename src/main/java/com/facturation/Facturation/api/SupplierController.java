package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IRoleService;
import com.Facturation.Facturation.application.ISupplierService;
import com.Facturation.Facturation.model.Role;
import com.Facturation.Facturation.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/supplier")
public class SupplierController extends GenericController<Supplier, Integer> {

    private ISupplierService _service;

    @Autowired
    public SupplierController(ISupplierService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Supplier, Integer> getService() {
        return _service;
    }
}