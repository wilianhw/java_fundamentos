package aula30.heranca;

public class Jogador extends Pessoa2 {

    protected boolean aindaJoga = false;

    protected void dizerSeJoga() {
        System.out.println("Ainda joga? " + this.aindaJoga);
    }
}
