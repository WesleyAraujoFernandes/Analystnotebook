package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SufixoOutraColuna extends Action {
    public enum SEPARADOR {
        NENHUM("Nenhum"),
        ESPACO("Espaço"),
        VIRGULA("Vírgula"),
        HIFEN("Hífen"),
        OUTRO("Outro");

        private String value;

        SEPARADOR(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private Integer numeroColuna;
}
