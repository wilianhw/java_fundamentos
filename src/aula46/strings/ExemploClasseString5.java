package aula46.strings;

public class ExemploClasseString5 {
    public static void main(String[] args) {
        String s = "Desenvolvimento Java";

        // Começa a partir da posição definida nesse caso 16
        System.out.println(s.substring(16));

        // A ultima posição para frente não é printada
        String s2 = "Curso online de desenvolvimento de software";
        System.out.println(s.substring(7, 12));
    }
}
