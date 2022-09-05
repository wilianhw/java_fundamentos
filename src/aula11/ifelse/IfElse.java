package aula11.ifelse;

import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite se nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso: ");
        int peso = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble(); 

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Sobre peso");
        } else {
            System.out.println("Obesidade");
            System.out.println("Cuidado com seu peso");
        }
    }
}