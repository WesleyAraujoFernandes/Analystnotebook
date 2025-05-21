package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class RemoverPrefixo {
    private String prefixo;
    private Boolean ignorarMaiusculoMinusculo;
}
