package br.com.viaapia.analystnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystnotebook.model.Condition;
import br.com.viaapia.analystnotebook.repository.ConditionRepository;

@Service
public class ConditionService {
    private final ConditionRepository conditionRepository;

    public ConditionService(ConditionRepository conditionRepository) {
        this.conditionRepository = conditionRepository;
    }

    public Condition save(Condition condition) {
        return conditionRepository.save(condition);
    }

    public void saveAll(List<Condition> conditions) {
        conditionRepository.saveAll(conditions);
    }

    public Condition findById(String id) {
        return conditionRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        conditionRepository.deleteById(id);
    }

    public List<Condition> findAll() {
        return conditionRepository.findAll();
    }

    public Condition update(String id, Condition condition) {
        Condition existingCondition = conditionRepository.findById(id).orElse(null);
        if (existingCondition != null) {
            condition.setId(id);
            condition.setDescription(existingCondition.getDescription());
            return conditionRepository.save(condition);
        }
        return null;
    }

    public List<Condition> findByDescription(String description) {
        return conditionRepository.findByDescription(description);
    }
}
