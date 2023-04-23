package aula55.gravandoarquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("emails.txt"))) {
            String email = reader.readLine();
            while (email != null) {
                System.out.println("Enviado email para: " + email);
                email = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Não conseguiu ler o arquivo: " + e.getMessage());
        }
    }
}
