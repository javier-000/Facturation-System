package com.Facturation.Facturation.infrastructure;

import com.Facturation.Facturation.infrastructure.Generic.IGenericRepository;
import com.Facturation.Facturation.model.Competence;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompetenceRepository extends IGenericRepository<Competence, Integer> {
}
