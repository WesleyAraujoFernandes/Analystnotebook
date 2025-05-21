package br.com.viaapia.analystnotebook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viaapia.analystnotebook.enumeration.ActionAvailable;

@RestController
@RequestMapping("/action-available")
public class ActionAvailableController {
    @GetMapping
    public List<ActionAvailable> getAll() {
        return Arrays.stream(ActionAvailable.values())
                .peek(action -> System.out.println(action.name() + " - " + action.getDescription()))
                .toList();
    }
}
