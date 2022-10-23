package aula29.enums;

public enum Naipe {

    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelho");

    private Naipe(String cor) {
        this.cor = cor;
    }

    private final String cor;

    public String getCor() {
        return this.cor;
    }
}
