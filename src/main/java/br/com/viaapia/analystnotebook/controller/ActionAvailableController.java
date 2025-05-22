package br.com.viaapia.analystnotebook.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystnotebook.dto.ActionAvailableDTO;
import br.com.viaapia.analystnotebook.enumeration.AlteraUsoMaiusculaMinusculaEnum;

@RestController
@RequestMapping("/action-available")
public class ActionAvailableController {
    @GetMapping
    public List<ActionAvailableDTO> getAll() {
        List<ActionAvailableDTO> actionAvailableList = Arrays.stream(AlteraUsoMaiusculaMinusculaEnum.values())
                .map(valor -> new ActionAvailableDTO(valor.name(), valor.getDescricao()))
                .collect(Collectors.toList());
        return actionAvailableList;
    }

}
