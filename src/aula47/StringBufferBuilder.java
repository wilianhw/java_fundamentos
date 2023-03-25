package aula47;

public class StringBufferBuilder {
    public static void main(String[] args) {
        // Util quando eu precisar ficar concatenando Strings
        // StringBuffer s = new StringBuffer(); // thread-safe - usar no contexto de concorrencia
        StringBuilder s = new StringBuilder(); // no-tread-safe - não usar no contexto de concorrencia

        s.append("Bem vindo ao curso de Java ");
        s.append("Fique a vontade pra tirar suas dúvidas ");
        s.append("Estamos aqui para te ajudar");

        System.out.println(s.toString());

        s.insert(26, "da AlgaWorks");

        System.out.println(s);
    }
}
