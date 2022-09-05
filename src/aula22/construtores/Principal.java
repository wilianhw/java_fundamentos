package aula22.construtores;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        System.out.println("Nome: " + pessoa1.nome + " - Idade: " + pessoa1.idade);

        Pessoa pessoa2 = new Pessoa("Maria", 25);
        System.out.println("Nome: " + pessoa2.nome + " - Idade: " + pessoa2.idade);
    }
}