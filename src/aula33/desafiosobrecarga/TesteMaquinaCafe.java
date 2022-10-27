package aula33.desafiosobrecarga;

public class TesteMaquinaCafe {

    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.acucarDisponivel = 30;

        maquinaCafe.fazerCafe(15);
        maquinaCafe.fazerCafe();
        maquinaCafe.fazerCafe();
    }
}
