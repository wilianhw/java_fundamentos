package aula15.whiledowhile;

import java.util.Scanner;

public class EstruturaWhileDoWhile {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura while
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        while (valor1 <= valor2) {
            System.out.println(valor1++);
        }

        // Estrutura do-while
        int soma = 0, valor = 0;
        do {
            System.out.print("Digite 0 para sair ou outro valor para somar: ");
            valor = scanner.nextInt();
            soma += valor;
            System.out.println("Soma dos valores: " + soma);
        } while (valor != 0);
    }
}