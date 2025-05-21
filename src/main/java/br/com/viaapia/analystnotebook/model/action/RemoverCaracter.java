package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class RemoverCaracter {
    private Boolean removerTab;
    private Boolean removerEspaco;
    private Boolean ignorarMaiusculoMinusculo;
    private String removerOutro;
}
