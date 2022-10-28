package aula36.caixa;

import aula36.impressao.Imprimivel1;
import aula36.pagamento.Autorizavel1;

public class Compra1 implements Autorizavel1, Imprimivel1 {

    private Double valorTotal;
    private String nomeProduto;
    private String nomeCliente;

    @Override
    public Double getValorTotal() {
        return this.valorTotal;
    }

    @Override
    public String getCabelhoPagina() {
        return this.getNomeProduto() + " = " + this.getValorTotal();
    }

    @Override
    public String getCorpoPagina() {
        return this.getNomeCliente();
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
