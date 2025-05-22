package br.com.viaapia.analystnotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("condition_applied")
public class ConditionApplied {
    @Id
    String id;
    Condition condition;
    String value;
}
