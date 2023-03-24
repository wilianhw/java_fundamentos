package aula46.strings;

public class ExemploClasseString {
    public static void main(String[] args) {
        // String são imutaveis
        String nome = "Pedro";
        System.out.println(nome.toUpperCase());
        System.out.println(nome);

        nome = nome.toUpperCase();
        System.out.println(nome);

        // String.equals() compara o conteudo
        String s1 = "Pedro";
        String s2 = "Pedro";
        System.out.println("s1 == s2 ? " + (s1 == s2));

        String s3 = new String("Pedro");
        System.out.println("s1 == s3 ? " + (s1 == s3));

        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.println("s1.equals(s3)? " + s1.equals(s3));

        // Utilização de equalsIgnoreCase
        String s4 = new String("PedRo");
        System.out.println("s1.equals(s4)? " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase? " + s1.equalsIgnoreCase(s4));
    }
}
