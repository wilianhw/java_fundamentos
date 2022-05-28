public class Principal {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura();

        temperatura.trocarTemperatura(50);
        temperatura.obterTemperatura();

        temperatura.trocarTemperatura(20);
        temperatura.obterTemperatura();
    }
}