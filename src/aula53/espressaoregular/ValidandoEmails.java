package aula53.espressaoregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {
    public static void main(String[] args) {
        String[] emails = {"joao@joao.com", "maria@", "jose@jose"};

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        for (String email: emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                System.out.println(email + ": É um email válido");
        }
    }
}
