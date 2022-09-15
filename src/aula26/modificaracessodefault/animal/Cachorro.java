package aula26.modificaracessodefault.animal;

public class Cachorro {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void sentar() {
        System.out.println("Eu " + this.nome + " vou sentar");
    }
}