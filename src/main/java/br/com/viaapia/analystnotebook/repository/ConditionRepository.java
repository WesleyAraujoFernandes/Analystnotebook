package br.com.viaapia.analystnotebook.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.viaapia.analystnotebook.model.ConditionOld;

@Repository
public interface ConditionRepository extends MongoRepository<ConditionOld, String> {
    List<ConditionOld> findByDescription(String description);
}
