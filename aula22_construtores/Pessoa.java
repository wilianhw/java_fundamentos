public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome) {
        this.nome = nome;
    }

    Pessoa(String nome, int idade) {
        // Estre trecho chama o construtor adequado de acordo com os paramêtros passados
        this(nome);

        this.idade = idade;
    }
}