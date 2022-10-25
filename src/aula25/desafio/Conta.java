package aula25.desafio;

public class Conta {
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected SituacaoConta situacaoConta;

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
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

    public SituacaoConta getSituacaoConta() {
        return this.situacaoConta;
    }

    public void cancelar() {
        if (this.situacaoConta != SituacaoConta.PENDENTE)
            System.out.println("Não se pode cancelar uma conta que esteja cancelada ou paga");
        else
            this.situacaoConta = SituacaoConta.CANCELADA;
    }
}
