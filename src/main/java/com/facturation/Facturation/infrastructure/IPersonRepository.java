package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends IGenericRepository<Person, Integer> {
}
