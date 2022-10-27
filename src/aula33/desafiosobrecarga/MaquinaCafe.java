package aula33.desafiosobrecarga;

public class MaquinaCafe {

    public Integer acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(Integer quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar) {
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }
}
