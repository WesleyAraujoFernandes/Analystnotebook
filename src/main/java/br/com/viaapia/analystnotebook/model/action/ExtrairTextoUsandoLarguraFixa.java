package br.com.viaapia.analystnotebook.model.action;

import lombok.Data;

@Data
public class ExtrairTextoUsandoLarguraFixa {
    private Integer primeiroCaracter;
    private Integer ultimoCaracter;
    private Boolean primeiroCaracterContagemInicio;
    private Boolean ultimoCaracterContagemInicio;
}
