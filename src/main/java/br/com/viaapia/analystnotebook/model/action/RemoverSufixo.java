package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class RemoverSufixo {
    private String sufixo;
    private Boolean ignorarMaiusculoMinusculo;
}
