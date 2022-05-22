import java.util.Scanner;

public class OperadoresEeOu {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite se nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo da pessoa: 1 para masculino e 2 para feminino");
        char sexo = scanner.nextShort() == 1 ? 'M' : 'F';

        System.out.print("Digite seu peso: ");
        int peso = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble(); 

        double imc = peso / (altura * altura);

        if ((imc <= 19.1 && sexo == 'F') || (imc <= 20.7 && sexo == 'M')) {
            System.out.println("Abaixo do peso ideal");
        } else if ((imc <= 25.8 && sexo == 'F') || (imc <= 26.4 && sexo == 'M')) {
            System.out.println("Peso ideal");
        } else if ((imc <= 32.3 && sexo == 'F') || (imc <= 31.1 && sexo == 'M')) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}