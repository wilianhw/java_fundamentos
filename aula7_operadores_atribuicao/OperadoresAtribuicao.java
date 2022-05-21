public class OperadoresAtribuicao {
    public static void main(String args[]) {
        int valor = 10;

        System.out.println("Soma: " + (valor+=5));
        System.out.println("Subtracação: " + (valor-=5));
        System.out.println("Multiplicação: " + (valor*=5));
        System.out.println("Divisão: " + (valor/=5));
        System.out.println("Modulo: " + (valor%=5));
    }
}