package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPersonRepository;
import com.Facturation.Facturation.infrastructure.ISupplierRepository;
import com.Facturation.Facturation.model.Person;
import com.Facturation.Facturation.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends GenericService<Supplier, Integer> implements ISupplierService{

    private ISupplierRepository _repository;

    @Autowired
    public SupplierService(ISupplierRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Supplier, Integer> getDao() {
        return _repository;
    }
}
