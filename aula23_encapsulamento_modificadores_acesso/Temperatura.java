public class Temperatura {

    private int temperatura;

    public void trocarTemperatura(int temperatura) {
        if (temperatura > 15 && temperatura < 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura inválida, digite um valor entre 15 e 30");
        }
    }

    public void obterTemperatura() {
        System.out.println("Temperatura atual: " + this.temperatura);
    }
}