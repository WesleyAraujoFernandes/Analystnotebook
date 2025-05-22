package br.com.viaapia.analystnotebook.enumeration;

/**
 * AlteraUsoMaiusculaMinuscula
 * 
 * Enumeração para representar operações de alteração de uso de maiúsculas e
 * minúsculas em textos.
 * 
 * @author Via Ápia
 * @version 1.0
 * @since 2023-10-05
 */
public enum AlteraUsoMaiusculaMinusculaEnum {
    ALTERAR_PARA_MAIUSCULA("Alterar para maiúscula"),
    ALTERAR_PARA_MINUSCULA("Alterar para minúscula"),
    ALTERAR_PARA_LETRAS_MAIUSCULAS_INICIAIS("Alterar para letras maiúsculas iniciais"),
    ALTERNAR_USO_MAIUSCULA_MINUSCULA("Alternar uso maiúscula/minúscula");

    private final String descricao;

    AlteraUsoMaiusculaMinusculaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static AlteraUsoMaiusculaMinusculaEnum fromDescricao(String descricao) {
        for (AlteraUsoMaiusculaMinusculaEnum valor : values()) {
            if (valor.getDescricao().equalsIgnoreCase(descricao)) {
                return valor;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
