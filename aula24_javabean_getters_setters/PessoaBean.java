// Java Bean tem um padrão de estrutura onde os atributos são privados,
// tem um construtor e tem os métodos getter e setter.
public class PessoaBean {
    private String nome;
    private int idade;

    PessoaBean() {

    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}