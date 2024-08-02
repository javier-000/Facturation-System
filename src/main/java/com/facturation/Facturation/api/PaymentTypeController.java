package com.Facturation.Facturation.api;

import com.Facturation.Facturation.api.Generic.GenericController;
import com.Facturation.Facturation.application.Generic.IGenericService;
import com.Facturation.Facturation.application.IPaymentTypeService;
import com.Facturation.Facturation.model.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/payment-type")
public class PaymentTypeController extends GenericController<PaymentType, Integer> {

    private IPaymentTypeService _service;

    @Autowired
    public PaymentTypeController(IPaymentTypeService service){
        this._service = service;
    }

    @Override
    protected IGenericService<PaymentType, Integer> getService() {
        return _service;
    }
}