package aula25.desafio;

public class ContaPagar extends Conta1 {
    private Fornecedor fornecedor;

    public ContaPagar() {
        super();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("Data vencimento: " + this.getDataVencimento());
        System.out.println("Nome fornecedor: " + this.getFornecedor().getNome());
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        super();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void pagar() throws OperacaoContaException {
        if (this.situacaoConta != SituacaoContaDesafio.PENDENTE)
            throw new OperacaoContaException("A conta só pode ser paga se a situação for " + SituacaoContaDesafio.PENDENTE);
        this.situacaoConta = SituacaoContaDesafio.PAGA;
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Data vencimento: " + this.dataVencimento);
        System.out.println("Nome fornecedor: " + this.fornecedor.getNome());
        System.out.println("================================================");
    }
}