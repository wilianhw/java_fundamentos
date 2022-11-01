package aula38.classmath.gerador;

public class GeradorNumeros {

    public long[][] gerarNumerosAleatorios(int numeroJogos) {
        long[][] jogos = new long[numeroJogos][6];
        for (int i = 0; i < jogos.length; i++) {
            for (int j = 0; j < jogos[i].length; j++) {
                long jogo = Math.round(jogos[i][j]);
                boolean jaExiste = this.verifyIfExists(jogo, jogos[i]);
                while (jaExiste) {
                    jogo = (long) (Math.random() * 60);
                    jaExiste = this.verifyIfExists(jogo, jogos[i]);
                }
                jogos[i][j] = jogo;
            }
        }
        return jogos;
    }

    private boolean verifyIfExists(long valor, long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (valor == array[i])
                return true;
        }
        return false;
    }
}
