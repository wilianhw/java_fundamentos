import java.util.Scanner;

public class DivisaoProdutos {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
		
	    int codigoProduto = 0;
        String corredor = "";
	    do {
	    	System.out.print("Digite o codigo do produto: ");
	    	codigoProduto = entrada.nextInt();

            if (codigoProduto != 0) {
                corredor = codigoProduto % 2 == 0 ? "Direita" : "Esquerda";
            }

            for (int i = 8; i > 0; i--) {
                if (codigoProduto % i == 0) {
                    System.out.println("O produto de código " + codigoProduto + " será armazenado no corredor há " + corredor + ", na gaveta " + i);
                    break;
                }
            }
    
	    } while (codigoProduto != 0);
    }
}