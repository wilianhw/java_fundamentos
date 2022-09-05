package aula24.javabean.getterssetters;

public class Principal {
    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("João");
        pessoa.setIdade(23);

        System.out.println("Nome: " + pessoa.getNome() + " - Idade: " + pessoa.getIdade());
    }
}