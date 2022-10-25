package aula25.desafio;

public class ContaReceber extends Conta {

    public Cliente cliente;

    public ContaReceber() {
        super();
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void receber() {
        System.out.println("Recebendo grana!!!");;
    }

    @Override
    public void cancelar() {
        if (this.valor > 50000)
            super.cancelar();
    }
}
