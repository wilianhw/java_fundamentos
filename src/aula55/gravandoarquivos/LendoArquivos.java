package aula55.gravandoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("itenspedido.txt")))) {
            scanner.useDelimiter(";");
            Locale locale = new Locale("pt", "BR");
            scanner.useLocale(locale);
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

            while (scanner.hasNext()) {
                String produto = scanner.next();
                int quantidade = scanner.nextInt();
                double valor = scanner.nextDouble();
                scanner.nextLine();

                System.out.printf("Produto: %s \nQuantidade: %d\nValor: %s\n*****\n",
                        produto, quantidade, numberFormat.format(valor));
            }
        } catch (IOException e) {
            System.out.println("Erro abring arquivo: " + e.getMessage());
        }
    }
}
