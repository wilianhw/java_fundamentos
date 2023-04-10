package aula50.varargs;

public class CorreioEletronico {

    public void enviarEmails(String... emails) {
        for (String email : emails)
            System.out.println(email);
    }
}
