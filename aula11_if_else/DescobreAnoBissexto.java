import java.util.Scanner;

public class DescobreAnoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
	}

}