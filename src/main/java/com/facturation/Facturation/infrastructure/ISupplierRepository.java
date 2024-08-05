package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Role;
import com.Facturation.Facturation.model.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupplierRepository extends IGenericRepository<Supplier, Integer> {
}
