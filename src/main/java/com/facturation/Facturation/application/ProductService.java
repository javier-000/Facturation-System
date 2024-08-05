package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPaymentTypeRepository;
import com.Facturation.Facturation.infrastructure.IProductRepository;
import com.Facturation.Facturation.model.PaymentType;
import com.Facturation.Facturation.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends GenericService<Product, Integer> implements IProductService{

    private IProductRepository _repository;

    @Autowired
    public ProductService(IProductRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Product, Integer> getDao() {
        return _repository;
    }
}
