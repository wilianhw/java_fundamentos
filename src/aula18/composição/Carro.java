package aula18.composição;

public class Carro {
    String cor;
    String marca;
    String tipo;
    Dono dono;

    void ligar() {
        System.out.println("Ligando o carro " + this.marca);
    }
}