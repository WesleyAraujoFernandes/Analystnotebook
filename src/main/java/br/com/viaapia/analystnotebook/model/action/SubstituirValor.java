package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SubstituirValor extends Action {
    private String valor;
    private String novoValor;
    private Boolean ignorarMaiusculoMinusculo;
}
