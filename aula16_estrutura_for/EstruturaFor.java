import java.util.Scanner;

public class EstruturaFor {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura de repetição for
        System.out.print("Digite o tamanho do laço: ");
        int tamanho = scanner.nextInt();

        // Valor inicial; Condição de parada; Alteração da variável de controle
        for (int i = 1; i <= tamanho; i++) {
            System.out.println(i);
        }

        // O comando break é usado para sair fora do comando for
        System.out.print("Digite um divisor: ");
        int divisor = scanner.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------");
        // O comando continue é usado para pular a iteração em que ele está em questão
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}