package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPaymentTypeRepository;
import com.Facturation.Facturation.infrastructure.IPersonRepository;
import com.Facturation.Facturation.model.PaymentType;
import com.Facturation.Facturation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person, Integer> implements IPersonService{

    private IPersonRepository _repository;

    @Autowired
    public PersonService(IPersonRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Person, Integer> getDao() {
        return _repository;
    }
}
