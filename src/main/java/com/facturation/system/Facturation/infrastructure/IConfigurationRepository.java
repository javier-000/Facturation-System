package com.facturation.system.Facturation.infrastructure;

import com.facturation.system.Facturation.domain.Configuration;
import com.facturation.system.Facturation.infrastructure.Generic.IGenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConfigurationRepository extends IGenericRepository<Configuration, Integer> {
}
