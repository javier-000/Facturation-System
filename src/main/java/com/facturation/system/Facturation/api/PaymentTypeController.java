package com.facturation.system.Facturation.api;

import com.facturation.system.Facturation.api.Generic.GenericController;
import com.facturation.system.Facturation.application.IGenericService;
import com.facturation.system.Facturation.application.IPaymentTypeService;
import com.facturation.system.Facturation.application.PaymentTypeService;
import com.facturation.system.Facturation.domain.PaymentType;
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