package br.com.viaapia.analystnotebook.model;

import java.util.List;

import lombok.Data;

@Data
public abstract class Action {
    private String id; // Identificador único da ação
    private String name; // Nome da ação
    private List<Condition> conditions; // Condições da ação
}
