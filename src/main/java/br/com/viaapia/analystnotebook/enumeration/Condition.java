package br.com.viaapia.analystnotebook.enumeration;

public enum Condition {
    CONTEM("Contém"),
    NAO_CONTEM("Não contém"),
    NAO_TERMINA_COM("Não termina com"),
    NAO_INICIA_COM("Não inicia com"),
    TERMINA_COM("Termina com"),
    VAZIO("Está vazio"),
    NAO_VAZIO("Não está vazio"),
    COMPRIMENTO_IGUAL_A("Comprimento igual a"),
    COMPRIMENTO_MAIOR_QUE("Comprimento maior que"),
    COMPRIMENTO_MENOR_QUE("Comprimento menor que"),
    EXPRESSAO_REGULAR("Expressão regular"),
    INICIA_COM("Inicia com");

    private String description;

    Condition(String description) {
        this.description = description;
    }
}
