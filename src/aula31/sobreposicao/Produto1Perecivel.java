package aula31.sobreposicao;

import java.util.Date;

public class Produto1Perecivel extends Produto1 {

    protected Date data;

    @Override
    public void identificar() {
        super.identificar();
        System.out.println("Minha data de validade: " + this.data);
    }
}
