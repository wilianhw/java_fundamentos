package aula46.strings;

public class ExemploClasseString6 {
    public static void main(String[] args) {
        // Retira espaçamentos vazios no inicio e final da String
        String s = "       Algaworks         ";
        System.out.println(">" + s + "<");
        System.out.println(">" + s.trim() + "<");
    }
}
