package br.com.viaapia.analystnotebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.viaapia.analystnotebook.model.ConditionOld;
import br.com.viaapia.analystnotebook.repository.ConditionRepository;

@Service
public class ConditionService {
    private final ConditionRepository conditionRepository;

    public ConditionService(ConditionRepository conditionRepository) {
        this.conditionRepository = conditionRepository;
    }

    public ConditionOld save(ConditionOld condition) {
        return conditionRepository.save(condition);
    }

    public void saveAll(List<ConditionOld> conditions) {
        conditionRepository.saveAll(conditions);
    }

    public ConditionOld findById(String id) {
        return conditionRepository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        conditionRepository.deleteById(id);
    }

    public List<ConditionOld> findAll() {
        return conditionRepository.findAll();
    }

    public ConditionOld update(String id, ConditionOld condition) {
        ConditionOld existingCondition = conditionRepository.findById(id).orElse(null);
        if (existingCondition != null) {
            condition.setId(id);
            condition.setDescription(existingCondition.getDescription());
            return conditionRepository.save(condition);
        }
        return null;
    }

    public List<ConditionOld> findByDescription(String description) {
        return conditionRepository.findByDescription(description);
    }
}
