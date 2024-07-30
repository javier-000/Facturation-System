package com.facturation.system.Facturation.application;

import com.facturation.system.Facturation.infrastructure.IGenericRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class GenericService<T,ID extends Serializable> implements IGenericService<T, ID> {

    public abstract IGenericRepository<T, ID> getDao();

    @Override
    public List<T> findByAll() {
        List<T> list = new ArrayList<>();
        getDao().findAll().forEach(obj -> list.add(obj));
        return list;
    }

    @Override
    public Page<T> findByAll(Pageable pageable) {
        Page<T> list = getDao().findAll(pageable);
        return list;
    }


    @Override
    public T save(T entity) {
        return getDao().save(entity);
    }

    @Override
    public T update(ID id, T entity) {
        Optional<T> optionaE = getDao().findById(id);
        if(optionaE.isPresent()){
            T entityUpdate = optionaE.get();
            entityUpdate = getDao().save(entity);
            return getDao().save(entityUpdate);
        }
        return null;
    }

    @Override
    public T findById(ID id) {
        Optional<T> obj = getDao().findById(id);
        if(obj.isPresent()){
            return obj.get();
        }
        return null;
    }

    @Override
    public void delete(ID id) {
        getDao().deleteById(id);
    }

}
