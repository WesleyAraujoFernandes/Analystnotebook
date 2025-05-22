package br.com.viaapia.analystnotebook.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("action_available")
public class ActionAvailable {
    private String id;

}
