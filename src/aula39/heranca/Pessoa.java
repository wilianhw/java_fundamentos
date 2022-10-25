package aula39.heranca;

public class Pessoa {
    protected String nome;
    protected int idade;

    protected void seApresentar() {
        System.out.println("Menu nome é " + this.nome + ", tenho " + this.idade + " de idade");
    }
}
