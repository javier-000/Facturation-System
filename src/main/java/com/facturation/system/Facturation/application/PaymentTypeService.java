package com.facturation.system.Facturation.application;

import com.facturation.system.Facturation.application.Generic.GenericService;
import com.facturation.system.Facturation.domain.PaymentType;
import com.facturation.system.Facturation.infrastructure.Generic.IGenericRepository;
import com.facturation.system.Facturation.infrastructure.IPaymentTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeService extends GenericService<PaymentType, Integer> implements IPaymentTypeService{

    private IPaymentTypeRepository _repository;

    public PaymentTypeService(IPaymentTypeRepository _repository){
        _repository = this._repository;
    }

    @Override
    public IGenericRepository<PaymentType, Integer> getDao() {
        return _repository;
    }
}
