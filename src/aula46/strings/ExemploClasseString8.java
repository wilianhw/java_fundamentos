package aula46.strings;

public class ExemploClasseString8 {
    public static void main(String[] args) {
        // busca o indice do elemente passado
        String s = "Java";
        int index = s.indexOf('a');

        System.out.println(index);
        index = s.lastIndexOf('a');
        System.out.println(index);
    }
}
