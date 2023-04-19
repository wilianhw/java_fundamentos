package aula54.generics;

public class TesteGaveta {
    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>();

        gaveta.colocar("Livro Java");

        System.out.println(gaveta.retiraPrimeiro());

        Gaveta<Integer> gaveta1 = new Gaveta<>();

        gaveta1.colocar(1);

        System.out.println(gaveta1.retiraPrimeiro() + 2);
    }
}
