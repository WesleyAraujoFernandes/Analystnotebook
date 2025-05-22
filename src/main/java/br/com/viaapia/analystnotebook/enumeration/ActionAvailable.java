package br.com.viaapia.analystnotebook.enumeration;

import java.util.Optional;

public enum ActionAvailable {
    ALTERAR_USO_MAIUSCULA_MINUSCULA("Alterar uso maiúscula e minúscula");

    private final String description;

    ActionAvailable(String description) {
        this.description = description;
    }

    public Optional<String> getDescription() {
        return Optional.of(this.description);
    }

    @Override
    public String toString() {
        return this.name() + " - " + this.description;
    }
    /*
     * public static Optional<String> fromDescription(String description) {
     * return Arrays.stream(ActionAvailable.values())
     * .filter(action -> action.getDescription().equalsIgnoreCase(description))
     * .findFirst().get().getDescription();
     * }
     */
}
