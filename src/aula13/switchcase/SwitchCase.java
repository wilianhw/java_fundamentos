package aula13.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua opção, 1 ou 2: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}