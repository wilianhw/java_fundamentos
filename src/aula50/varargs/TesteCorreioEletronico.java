package aula50.varargs;

public class TesteCorreioEletronico {
    public static void main(String[] args) {
        CorreioEletronico correioEletronico = new CorreioEletronico();

        String[] emails = {"joao@joao.com", "maria@maria.com"};

        correioEletronico.enviarEmails(emails);

        correioEletronico.enviarEmails("pedro@pedro.com", "jose@jose.com");
    }
}
