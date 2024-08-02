package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.PaymentType;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentTypeRepository extends IGenericRepository<PaymentType, Integer> {
}
