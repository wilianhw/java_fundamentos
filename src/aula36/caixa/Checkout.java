package aula36.caixa;

import aula36.impressao.IImpressora;
import aula36.pagamento.Cartao;
import aula36.pagamento.IOperadora;

public class Checkout {

    private IOperadora operadora;
    private IImpressora impressora;

    public Checkout(IOperadora operadora, IImpressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao) {
        Boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado)
            this.impressora.imprimir(compra);
        else
            System.out.println("Pagamento negado");
    }
}
