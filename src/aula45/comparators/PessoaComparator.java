package aula45.comparators;

public class PessoaComparator implements Comparable<PessoaComparator> {

    private String nome;
    private Integer idade;

    public PessoaComparator(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(PessoaComparator pessoaComparator) {
        return this.nome.compareTo(pessoaComparator.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "; Idade: " + this.idade;
    }
}
