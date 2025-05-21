package br.com.viaapia.analystnotebook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.viaapia.analystnotebook.model.Condition;

@Repository
public interface ConditionRepository extends MongoRepository<Condition, String> {
    List<Condition> findByDescription(String description);
}
