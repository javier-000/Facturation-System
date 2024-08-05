package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.application.ICompetenceService;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/competence")
public class CompetenceController extends GenericController<Competence, Integer> {

    private ICompetenceService _service;

    @Autowired
    public CompetenceController(ICompetenceService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Competence, Integer> getService() {
        return _service;
    }
}