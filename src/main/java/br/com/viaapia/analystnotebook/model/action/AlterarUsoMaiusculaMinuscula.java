package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import br.com.viaapia.analystnotebook.model.Condition;

// Altera o uso de letras maiúsculas e minúsculas
// Exemplo: "A" -> "a", "a" -> "A"
public class AlterarUsoMaiusculaMinuscula extends Action {

    public enum Type {
        MINUSCULA("MINUSCULA"),
        MAIUSCULA("MAIUSCULA"),
        PRIMEIRA_MAIUSCULA("PRIMEIRA_MAIUSCULA"),
        ALTERNAR_MAIUSCULA_MINUSCULA("ALTERNAR_MAIUSCULA_MINUSCULA");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    Condition condition;
    String conditionValue;
}
