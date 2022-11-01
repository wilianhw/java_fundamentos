package aula38.classmath;

import aula38.classmath.gerador.GeradorNumeros;

public class DesafioMegaSena {

    public static void main(String[] args) {
        GeradorNumeros geradorNumeros = new GeradorNumeros();
        long[][] jogos = geradorNumeros.gerarNumerosAleatorios(5);
        for (int i = 0; i < jogos.length; i++) {
            System.out.println();
            System.out.println("Jogo " + (i + 1));
            for (int j = 0; j < jogos[i].length; j++)
                System.out.print(" " + jogos[i][j] + " ");
            System.out.println();
        }
    }
}
