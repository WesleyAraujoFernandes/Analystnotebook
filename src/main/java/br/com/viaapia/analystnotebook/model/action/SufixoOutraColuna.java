package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class SufixoOutraColuna {
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
