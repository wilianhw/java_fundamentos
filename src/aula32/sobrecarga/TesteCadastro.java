package aula32.sobrecarga;

public class TesteCadastro {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 12);

        new CadastroPessoa(pessoa);

        new CadastroPessoa("Maria", 34);

        new CadastroPessoa("Pedro");
    }
}
