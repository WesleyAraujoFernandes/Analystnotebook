package br.com.viaapia.analystnotebook.enumeration;

public enum CompactarCaracterRepetido {
    COMPACTAR_CARACTERES_TABULACAO("Compactar caracteres de tabulação"),
    COMPACTAR_CARACTERES_ESPACO("Compactar caracteres de espaço"),
    COMPACTAR_CARACTERES_LISTADOS_ABAIXO("Compactar caracteres listados abaixo");

    private String description;

    private CompactarCaracterRepetido(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
