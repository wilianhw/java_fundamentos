package aula8.conversãotipos;

public class CalculadoraProfessor {
    public static void main(String args[]) {
        // constante do Pi - http://pt.wikipedia.org/wiki/Pi
		float pi = 3.14f;
		
		// raio - informado pelo professor
		float raio = 5.3f;

        // area eh igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * pi;
		
		System.out.println("Resultado: " + area);
        System.out.println("Resultado sem casas decimais: " + (int) area);
    }
}