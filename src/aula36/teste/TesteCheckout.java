package aula36.teste;


import aula36.caixa.Checkout;
import aula36.caixa.Compra1;
import aula36.impressao.IImpressora1;
import aula36.impressao.impressoras.IImpressora1Epson;
import aula36.pagamento.Cartao1;
import aula36.pagamento.IOperadora;
import aula36.pagamento.operadoras.Cielo;

public class TesteCheckout {

    public static void main(String[] args) {
        IOperadora IOperadora = new Cielo();
        IImpressora1 IImpressora1 = new IImpressora1Epson();

        Cartao1 cartao1 = new Cartao1();
        cartao1.setNomeTitular("João");
        cartao1.setNumeroCartao("123");

        Compra1 compra1 = new Compra1();
        compra1.setNomeCliente("João mendes");
        compra1.setNomeProduto("Banana");
        compra1.setValorTotal(5.5);

        Checkout checkout = new Checkout(IOperadora, IImpressora1);
        checkout.fecharCompra(compra1, cartao1);
    }
}
