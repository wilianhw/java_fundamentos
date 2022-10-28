package aula36.teste;

import aula36.caixa.Checkout;
import aula36.caixa.Compra;
import aula36.impressao.IImpressora;
import aula36.impressao.impressoras.IImpressoraEpson;
import aula36.pagamento.Cartao;
import aula36.pagamento.IOperadora;
import aula36.pagamento.operadoras.Cielo;

public class TesteCheckout {

    public static void main(String[] args) {
        IOperadora IOperadora = new Cielo();
        IImpressora IImpressora = new IImpressoraEpson();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João");
        cartao.setNumeroCartao("123");

        Compra compra = new Compra();
        compra.setNomeCliente("João mendes");
        compra.setNomeProduto("Banana");
        compra.setValorTotal(5.5);

        Checkout checkout = new Checkout(IOperadora, IImpressora);
        checkout.fecharCompra(compra, cartao);
    }
}
