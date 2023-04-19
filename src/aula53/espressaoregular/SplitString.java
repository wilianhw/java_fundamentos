package aula53.espressaoregular;

public class SplitString {
    public static void main(String[] args) {
        String texto = "O4java1é3uma90linguagem9orientada1a7objetos";

        String[] novoTexto = texto.split("\\d+");
        for (String t: novoTexto)
            System.out.println(t);
    }
}
