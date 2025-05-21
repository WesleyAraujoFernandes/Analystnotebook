package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RemoverSufixo extends Action {
    private String sufixo;
    private Boolean ignorarMaiusculoMinusculo;
}
