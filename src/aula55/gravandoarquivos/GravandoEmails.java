package aula55.gravandoarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmails {
    public static void main(String[] args) {
        String[] emails = {"joao@joao.com", "maria@maria.com", "ricardo@ricardo.com"};

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("emails.txt"));
            for (String email: emails) {
                writer.write(email);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Não conseguiu gravar o arquivo." + e);
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Falha a fechar o Buffer." + e);
            }
        }
    }
}
