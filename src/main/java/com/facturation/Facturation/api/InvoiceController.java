package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IClasificationService;
import com.Facturation.Facturation.application.IInvoiceService;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController extends GenericController<Invoice, Integer> {

    private IInvoiceService _service;

    @Autowired
    public InvoiceController(IInvoiceService service){
        this._service = service;
    }

    @Override
    protected IGenericService<Invoice, Integer> getService() {
        return _service;
    }
}