package aula25.desafio;

public abstract class Conta1 {
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected SituacaoContaDesafio situacaoConta;

    public Conta1() {
        this.situacaoConta = SituacaoContaDesafio.PENDENTE;
    }

    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return this.valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoContaDesafio getSituacaoConta() {
        return this.situacaoConta;
    }

    public void cancelar() throws OperacaoContaException {
        if (this.situacaoConta != SituacaoContaDesafio.PENDENTE)
            throw new OperacaoContaException("Não se pode cancelar uma conta que esteja cancelada ou paga");
        this.situacaoConta = SituacaoContaDesafio.CANCELADA;
    }

    public abstract void exibirDetalhes();
}
