package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.application.IProductService;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductController extends GenericController<Product, Integer> {

    private IProductService _service;

    @Autowired
    public ProductController(IProductService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Product, Integer> getService() {
        return _service;
    }
}