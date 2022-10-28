package aula37.desafiopolimorfismointerface;

import aula37.desafiopolimorfismointerface.impl.Carro;
import aula37.desafiopolimorfismointerface.impl.Imovel;

public class TesteDesafio37 {

    public static void main(String[] args) {
        Carro carro = new Carro(1500.0, 1995);
        Imovel imovel = new Imovel(45000, 200);

        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        corretoraSeguros.fazerPropostaSeguro(carro);
        corretoraSeguros.fazerPropostaSeguro(imovel);
    }
}
