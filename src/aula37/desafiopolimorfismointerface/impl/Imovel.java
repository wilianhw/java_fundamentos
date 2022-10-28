package aula37.desafiopolimorfismointerface.impl;

import aula37.desafiopolimorfismointerface.ISeguravel;

public class Imovel implements ISeguravel {

    private double valorMercado;
    private int areaConstruida;

    public Imovel(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public String obterDescricao() {
        return "Imóvel com área construída de " + this.areaConstruida + "m2 e valor de mercado "
                + this.valorMercado;
    }

    public Double calcularValorApolice() {
        Double valorApolice = this.valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }
}
