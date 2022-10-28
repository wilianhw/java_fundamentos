package aula37.desafiopolimorfismointerface.impl;

import aula37.desafiopolimorfismointerface.ISeguravel;

public class Carro implements ISeguravel {

    private Double valorMercado;
    private Integer anoFabricacao;

    public Carro(Double valorMercado, Integer anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public Double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Carro ano " + this.anoFabricacao + " com valor de mercado "
                + this.valorMercado;
    }
}
