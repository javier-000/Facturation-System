package com.facturation.system.Facturation.api.Generic;
import com.facturation.system.Facturation.application.IGenericService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

public abstract class GenericController<T, ID extends Serializable> implements IGenericController<T, ID> {
    protected abstract IGenericService<T,ID> getService();

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<T>> findByAll() {
        try {
            return new ResponseEntity<>(getService().findByAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping("/pageable")
    public ResponseEntity<?> findByAll(Pageable pageable) {
        try {
            return new ResponseEntity<>(getService().findByAll(pageable), HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @GetMapping("/findOne/{id}")
    public ResponseEntity<T> findByOne(ID id) {
        try {
            T entity = getService().findById(id);
            if(entity != null){
                return new ResponseEntity<>(getService().findById(id), HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception e){

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<?> save(T entity) {
        try {
            return new ResponseEntity<>(getService().save(entity) ,HttpStatus.CREATED);
        }catch (DataIntegrityViolationException e){
            System.out.println("-> "+e.getCause());
            return new ResponseEntity<>("El identificador no se puede repetir.",HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            System.out.println("->eeeeeeeeeeee "+e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<T> update(ID id, T entity) {
        try {
            T update = getService().update(id, entity);
            if(update != null){
                return new ResponseEntity<>(update ,HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }catch (DataIntegrityViolationException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

   @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(ID id) {
        try {
            getService().delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}