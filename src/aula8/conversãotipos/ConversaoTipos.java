package aula8.conversãotipos;

public class ConversaoTipos {
    public static void main(String args[]) {
        long x = 1000;
        int y = (int) x;
        System.out.println(y);

        double a = 10.5;
        float b = (float) a;
        System.out.println(b);

        // Não é necessário fazer um casting de um tipo int para long
        // ou de um tipo float para double, pois ele é feito automaticamente.
    }
}