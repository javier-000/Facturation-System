package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.IClasificationRepository;
import com.Facturation.Facturation.infrastructure.ICompetenceRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetenceService extends GenericService<Competence, Integer> implements ICompetenceService{

    private ICompetenceRepository _repository;

    @Autowired
    public CompetenceService(ICompetenceRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Competence, Integer> getDao() {
        return _repository;
    }
}
