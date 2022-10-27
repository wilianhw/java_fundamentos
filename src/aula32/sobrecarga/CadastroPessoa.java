package aula32.sobrecarga;

public class CadastroPessoa {

    public CadastroPessoa(Pessoa pessoa) {
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    public CadastroPessoa(String nome, Integer idade) {
        armazenar(nome, idade);
    }

    public CadastroPessoa(String nome) {
        armazenar(nome, 0);
    }

    public void armazenar(String nome, Integer idade) {
        System.out.println("Nome: " + nome + " idade: " + idade);
    }
}
