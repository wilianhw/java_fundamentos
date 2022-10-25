package aula31.sobreposicao;

import java.util.Date;

public class TesteProduto {

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();

        produtoPerecivel.descricao = "Sardinha";
        produtoPerecivel.data = new Date();

        produtoPerecivel.identificar();
    }
}
