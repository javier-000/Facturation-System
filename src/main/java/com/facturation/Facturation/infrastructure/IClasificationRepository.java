package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Clasification;
import org.springframework.stereotype.Repository;

@Repository
public interface IClasificationRepository extends IGenericRepository<Clasification, Integer> {
}
