package aula39.heranca;

public class Jogador extends Pessoa{

    protected boolean aindaJoga = false;

    protected void dizerSeJoga() {
        System.out.println("Ainda joga? " + this.aindaJoga);
    }
}
