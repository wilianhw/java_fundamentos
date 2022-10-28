package aula31.sobreposicao;

import java.util.Date;

public class TesteProduto {

    public static void main(String[] args) {
        Produto1Perecivel produtoPerecivel = new Produto1Perecivel();

        produtoPerecivel.descricao = "Sardinha";
        produtoPerecivel.data = new Date();

        produtoPerecivel.identificar();
    }
}
