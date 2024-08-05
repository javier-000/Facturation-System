package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Supplier;
import com.Facturation.Facturation.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends IGenericRepository<User, Integer> {
}
