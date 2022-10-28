package aula36.pagamento;

public interface IOperadora {

    public Boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
