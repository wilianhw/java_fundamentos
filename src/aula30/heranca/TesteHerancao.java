package aula39.heranca;

public class TesteHerancao {

    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.nome = "Ronaldo";
        jogador.idade = 39;

        jogador.seApresentar();
        jogador.dizerSeJoga();
    }
}
