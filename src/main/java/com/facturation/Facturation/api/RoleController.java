package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.application.IRoleService;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/role")
public class RoleController extends GenericController<Role, Integer> {

    private IRoleService _service;

    @Autowired
    public RoleController(IRoleService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Role, Integer> getService() {
        return _service;
    }
}