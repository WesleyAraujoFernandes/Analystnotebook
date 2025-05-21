package br.com.viaapia.analystnotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("condition")
@Data
public class Condition {
    @Id
    private String id;
    private String description;

}
