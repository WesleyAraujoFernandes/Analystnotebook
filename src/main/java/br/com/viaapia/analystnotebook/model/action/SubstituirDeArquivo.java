package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class SubstituirDeArquivo {
    private String arquivo;
    private Boolean ignorarMaiusculoMinusculo = true;
}
