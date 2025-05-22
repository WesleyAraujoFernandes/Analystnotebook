package br.com.viaapia.analystnotebook.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystnotebook.model.Condition;
import br.com.viaapia.analystnotebook.service.ConditionService;

@RestController
@RequestMapping("/api/analystnotebook/conditions")
public class ConditionController {

    private final ConditionService conditionService;

    public ConditionController(ConditionService conditionService) {
        this.conditionService = conditionService;
    }

    @PostMapping
    public ResponseEntity<Condition> create(@RequestBody Condition condition) {
        Condition createdCondition = conditionService.save(condition);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCondition);
    }

    @PostMapping("/saveAll")
    public ResponseEntity<Condition> saveAll(@RequestBody List<Condition> conditions) {
        conditionService.saveAll(conditions);
        return new ResponseEntity<Condition>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Condition> findById(@PathVariable String id) {
        Condition condition = conditionService.findById(id);
        if (condition != null) {
            return ResponseEntity.ok(condition);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Condition>> findAll() {
        List<Condition> conditions = conditionService.findAll();
        return ResponseEntity.ok(conditions);
    }

    @GetMapping("/description/{description}")
    public ResponseEntity<List<Condition>> findByDescription(@PathVariable String description) {
        List<Condition> conditions = conditionService.findByDescription(description);
        if (conditions != null && !conditions.isEmpty()) {
            return ResponseEntity.ok(conditions);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Condition> update(@PathVariable String id, @RequestBody Condition condition) {
        Condition updatedCondition = conditionService.update(id, condition);
        if (updatedCondition != null) {
            return ResponseEntity.ok(updatedCondition);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        conditionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
