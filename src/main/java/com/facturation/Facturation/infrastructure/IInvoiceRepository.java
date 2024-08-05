package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Invoice;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceRepository extends IGenericRepository<Invoice, Integer> {
}
