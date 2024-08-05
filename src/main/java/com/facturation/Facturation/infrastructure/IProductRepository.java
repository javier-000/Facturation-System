package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends IGenericRepository<Product, Integer> {
}
