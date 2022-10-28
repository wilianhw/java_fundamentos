package aula36.caixa;

import aula36.impressao.IImpressora1;
import aula36.pagamento.Cartao1;
import aula36.pagamento.IOperadora;

public class Checkout {

    private IOperadora operadora;
    private IImpressora1 impressora;

    public Checkout(IOperadora operadora, IImpressora1 impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra1 compra1, Cartao1 cartao1) {
        Boolean autorizado = this.operadora.autorizar(compra1, cartao1);

        if (autorizado)
            this.impressora.imprimir(compra1);
        else
            System.out.println("Pagamento negado");
    }
}
