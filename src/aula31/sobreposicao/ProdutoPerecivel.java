package aula31.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

    protected Date data;

    @Override
    public void identificar() {
        super.identificar();
        System.out.println("Minha data de validade: " + this.data);
    }
}
