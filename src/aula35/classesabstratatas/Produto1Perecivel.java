package aula35.classesabstratatas;

public class Produto1Perecivel extends Produto {

    String dataValidade; //Por enquanto, até aprendermos a classe Date

    public void imprimirDescricao() {
        //Digitar a lógica...
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}

