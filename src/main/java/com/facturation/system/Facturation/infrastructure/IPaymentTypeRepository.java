package com.facturation.system.Facturation.infrastructure;

import com.facturation.system.Facturation.domain.PaymentType;
import com.facturation.system.Facturation.infrastructure.Generic.IGenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaymentTypeRepository extends IGenericRepository<PaymentType, Integer> {
}
