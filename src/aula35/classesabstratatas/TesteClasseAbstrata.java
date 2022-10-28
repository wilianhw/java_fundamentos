package aula35.classesabstratatas;

public class TesteClasseAbstrata {

    public static void main(String[] args) {
        Produto p = new Produto1Perecivel();
        p.descricao = "Caixa de Leite";

        Produto1Perecivel pp = (Produto1Perecivel) p;
        pp.dataValidade = "10/03/12";

        p.imprimirDescricao();

    }
}
