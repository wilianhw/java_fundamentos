package aula36.pagamento.operadoras;

import aula36.pagamento.Autorizavel;
import aula36.pagamento.Cartao;
import aula36.pagamento.IOperadora;

public class Cielo implements IOperadora {
    @Override
    public Boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
}
