package desafios.numeros;

public class TesteDesafioNumerico {
    public static void main(String[] args) {
        DesafioNumerico desafioNumerico = new DesafioNumerico();
        try {
            desafioNumerico.exibirValor(1d);
        } catch(Exception e) {
            System.out.println("Valor inválido " + e.getMessage());
        }
    }
}
