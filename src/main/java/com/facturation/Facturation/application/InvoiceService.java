package com.Facturation.Facturation.application;

import com.Facturation.Facturation.application.Generic.GenericService;
import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.infrastructure.ICompetenceRepository;
import com.Facturation.Facturation.infrastructure.IInvoiceRepository;
import com.Facturation.Facturation.model.Competence;
import com.Facturation.Facturation.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService extends GenericService<Invoice, Integer> implements IInvoiceService{

    private IInvoiceRepository _repository;

    @Autowired
    public InvoiceService(IInvoiceRepository repository){
        this._repository = repository;
    }

    @Override
    public IGenericRepository<Invoice, Integer> getDao() {
        return _repository;
    }
}
