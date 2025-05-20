package br.com.viaapia.analystnotebook.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Action {
    @Id
    String id;
    String description;
}
