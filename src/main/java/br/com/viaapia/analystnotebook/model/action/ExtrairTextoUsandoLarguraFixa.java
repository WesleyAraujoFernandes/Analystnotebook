package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExtrairTextoUsandoLarguraFixa extends Action {
    private Integer primeiroCaracter;
    private Integer ultimoCaracter;
    private Boolean primeiroCaracterContagemInicio;
    private Boolean ultimoCaracterContagemInicio;
}
