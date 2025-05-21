package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class ExtrairParteUsandoSeparador {
    public enum CARACTER_SEPARA_PARTE {
        ESPACO("Espaço"),
        TAB("Tabulação"),
        NOVA_LINHA("Nova Linha"),
        OUTRO("Outro");

        private String value;

        CARACTER_SEPARA_PARTE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private Integer extrairNumeroParte;
    private String ateIncluindoParte;

    private Boolean extrairNumeroParteContagemInicio;
    private Boolean ateIncluindoParteContagemInicio;
}
