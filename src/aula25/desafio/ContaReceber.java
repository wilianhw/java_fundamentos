package aula25.desafio;

public class ContaReceber extends Conta1 {

    public ClienteDesafio clienteDesafio;

    public ContaReceber() {
        super();
    }

    public ContaReceber(ClienteDesafio clienteDesafio, String descricao, Double valor, String dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.clienteDesafio = clienteDesafio;
    }

    public ClienteDesafio getCliente() {
        return clienteDesafio;
    }

    public void setCliente(ClienteDesafio clienteDesafio) {
        this.clienteDesafio = clienteDesafio;
    }

    public void receber() throws OperacaoContaException {
        if (this.valor <= 0)
            throw new OperacaoContaException("Nada a receber");
        System.out.println("Recebendo grana!!!");
    }

    @Override
    public void cancelar() throws OperacaoContaException {
        if (this.valor <= 5000)
            throw new OperacaoContaException("Impossível cancelar");
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
