package aula53.espressaoregular;

public class ReplasseString {
    public static void main(String[] args) {
        String texto = "O valor é @xxxxx@";

        String  novoTexto= texto.replaceAll("@x+@", "20.0");

        System.out.println(novoTexto);
    }
}
