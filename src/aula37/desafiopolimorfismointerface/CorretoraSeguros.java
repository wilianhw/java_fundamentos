package aula37.desafiopolimorfismointerface;

public class CorretoraSeguros {
    public void fazerPropostaSeguro(ISeguravel objetoSeguravel) {
        System.out.println("-------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("-------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("-------------------------------\n");
    }
}
