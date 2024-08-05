package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.ISupplierService;
import com.Facturation.Facturation.application.IUserService;
import com.Facturation.Facturation.model.Supplier;
import com.Facturation.Facturation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/user")
public class UserController extends GenericController<User, Integer> {

    private IUserService _service;

    @Autowired
    public UserController(IUserService service){
        this._service = service;
    }

    @Override
    protected IGenericService<User, Integer> getService() {
        return _service;
    }
}