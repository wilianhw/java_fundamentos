package aula5.operadoresaritmeticos;

public class PrecoMedioBombom {
    public static void main(String args[]) {
        // Preço das 3 ultimas vendas
        int preco1 = 5;
		int preco2 = 8;
		int preco3 = 12;

        int media = (preco1 + preco2 + preco3) / 3;

        System.out.println("\"Sistema de calculo de média\"");
        System.out.println("Preço 1: " + preco1);
        System.out.println("Preço 2: " + preco2);
        System.out.println("Preço 3: " + preco3);
        System.out.println("Média dos preços: " + media);
    }
}