package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RemoverCaracter extends Action {
    private Boolean removerTab;
    private Boolean removerEspaco;
    private Boolean ignorarMaiusculoMinusculo;
    private String removerOutro;
}
