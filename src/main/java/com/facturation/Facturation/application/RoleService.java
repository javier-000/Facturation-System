package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IPersonRepository;
import com.Facturation.Facturation.infrastructure.IRoleRepository;
import com.Facturation.Facturation.model.Person;
import com.Facturation.Facturation.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends GenericService<Role, Integer> implements IRoleService{

    private IRoleRepository _repository;

    @Autowired
    public RoleService(IRoleRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Role, Integer> getDao() {
        return _repository;
    }
}
