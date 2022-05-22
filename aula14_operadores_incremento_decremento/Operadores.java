import java.util.Scanner;

public class Operadores {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Operador ternário
        System.out.print("Digite a idade da pessoa: ");
        String maioridade = scanner.nextInt() >= 18 ? "Maior" : "Menor";
        System.out.println(maioridade);

        // Operadores de incremento e decremento
        int valor = 10;
        int valor1 = valor++; // Nesse caso o valor de idade é primeiro atribuido e depois incrementado, portanto o valor de nova idade é 10;
        System.out.println(valor1);
        int valor2 = ++valor; // Nesse caso o valor é incrementado e depois atribuido
        System.out.println(valor2);

        int ano = 2022;
        int novoAno = ano--;
        System.out.println(novoAno);
        int novoAno2 = --ano;
        System.out.println(novoAno2);
    }
}