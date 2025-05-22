package br.com.viaapia.analystnotebook.model.action;

import br.com.viaapia.analystnotebook.model.Action;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SubstituirDeArquivo extends Action {
    private String arquivo;
    private Boolean ignorarMaiusculoMinusculo = true;
}
