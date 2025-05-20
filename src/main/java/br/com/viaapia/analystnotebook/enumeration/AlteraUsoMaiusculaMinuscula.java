package br.com.viaapia.analystnotebook.enumeration;

/**
 * AlteraUsoMaiusculaMinuscula
 * 
 * @author Via Ápia
 * @version 1.0
 * @since 2023-10-05
 */
public enum AlteraUsoMaiusculaMinuscula {
    ALTERAR_PARA_MAIUSCULA("Alterar para maiúscula"),
    ALTERAR_PARA_MINUSCULA("Alterar para minúscula"),
    ALTERAR_PARA_LETRAS_MAIUSCULAS_INICIAIS("Alterar para letras maiúsculas iniciais"),
    ALTERNAR_USO_MAIUSCULA_MINUSCULA("Alternar uso maiúscula/minúscula");

    private String descricao;

    AlteraUsoMaiusculaMinuscula(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
