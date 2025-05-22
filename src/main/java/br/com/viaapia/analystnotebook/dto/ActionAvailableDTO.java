package br.com.viaapia.analystnotebook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActionAvailableDTO {
    private String name;
    private String description;
}
