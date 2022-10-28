package aula25.desafio;

public class ContaReceber extends Conta1 {

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
        System.out.println("Recebendo grana!!!");
    }

    @Override
    public void cancelar() {
        if (this.valor > 50000)
            super.cancelar();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("Data vencimento: " + this.getDataVencimento());
        System.out.println("Nome cliente: " + this.getCliente().getNome());
    }
}
