package aula28.testepratico.util;

public class MatematicaUtil {
    public static final Double PI = 3.14;

    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(Double raio) {
        return MatematicaUtil.PI * raio * raio;
    }
}
