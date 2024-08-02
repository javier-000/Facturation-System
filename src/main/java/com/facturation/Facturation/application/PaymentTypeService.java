package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPaymentTypeRepository;
import com.Facturation.Facturation.model.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeService extends GenericService<PaymentType, Integer> implements IPaymentTypeService{

    private IPaymentTypeRepository _repository;

    @Autowired
    public PaymentTypeService(IPaymentTypeRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<PaymentType, Integer> getDao() {
        return _repository;
    }
}
