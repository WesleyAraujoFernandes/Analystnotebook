package br.com.viaapia.analystnotebook.model;

import java.util.List;

import lombok.Data;

@Data
public abstract class Action {
    private String id;
    private String name;
    private List<Condition> conditions;
}
