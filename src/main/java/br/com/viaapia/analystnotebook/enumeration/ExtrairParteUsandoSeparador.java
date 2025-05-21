package br.com.viaapia.analystnotebook.enumeration;

public enum ExtrairParteUsandoSeparador {
    CARACTER_SEPARA_PARTES("ESPACO", "NOVA_LINHA", "TAB", "OUTRO");

    private String[] valores;

    private ExtrairParteUsandoSeparador(String... valores) {
        this.valores = valores;
    }

    public String[] getValores() {
        return valores;
    }
}
