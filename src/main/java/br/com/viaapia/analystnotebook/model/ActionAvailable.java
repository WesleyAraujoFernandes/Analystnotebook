package br.com.viaapia.analystnotebook.model;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.viaapia.analystnotebook.model.action.AlterarUsoMaiusculaMinuscula;
import lombok.Data;

@Data
@Document("action_available")
public class ActionAvailable {
    private String id;
    AlterarUsoMaiusculaMinuscula alterarUsoMaiusculaMinuscula;

}
