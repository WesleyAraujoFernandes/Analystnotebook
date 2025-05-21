package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class SubstituirValor {
    private String valor;
    private String novoValor;
    private Boolean ignorarMaiusculoMinusculo;
}
