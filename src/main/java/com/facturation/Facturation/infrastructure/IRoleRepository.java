package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Clasification;
import com.Facturation.Facturation.model.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends IGenericRepository<Role, Integer> {
}
