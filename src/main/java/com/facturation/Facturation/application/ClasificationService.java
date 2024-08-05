package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IClasificationRepository;
import com.Facturation.Facturation.infrastructure.IPaymentTypeRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificationService extends GenericService<Clasification, Integer> implements IClasificationService{

    private IClasificationRepository _repository;

    @Autowired
    public ClasificationService(IClasificationRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Clasification, Integer> getDao() {
        return _repository;
    }
}
