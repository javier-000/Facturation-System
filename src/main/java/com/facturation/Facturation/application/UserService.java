package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPersonRepository;
import com.Facturation.Facturation.infrastructure.IUserRepository;
import com.Facturation.Facturation.model.Person;
import com.Facturation.Facturation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GenericService<User, Integer> implements IUserService{

    private IUserRepository _repository;

    @Autowired
    public UserService(IUserRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<User, Integer> getDao() {
        return _repository;
    }
}
