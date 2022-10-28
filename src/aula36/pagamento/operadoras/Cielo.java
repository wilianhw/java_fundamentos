package aula36.pagamento.operadoras;

import aula36.pagamento.Autorizavel1;
import aula36.pagamento.Cartao1;
import aula36.pagamento.IOperadora;

public class Cielo implements IOperadora {
    @Override
    public Boolean autorizar(Autorizavel1 autorizavel1, Cartao1 cartao1) {
        return cartao1.getNumeroCartao().startsWith("123")
                && autorizavel1.getValorTotal() < 100;
    }
}
