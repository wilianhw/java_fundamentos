import java.util.Scanner;

public class RecebendoDados {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite se nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso: ");
        int peso = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble(); 

        double imc = peso / (altura * altura);

        System.out.println("O imc de " + nome + " com peso " + peso + " e altura " + altura + " é de " + imc);
    }
}