package aula25.desafio;

public class Conta1 {
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected SituacaoConta1 situacaoConta;

    public Conta1() {
        this.situacaoConta = SituacaoConta1.PENDENTE;
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

    public SituacaoConta1 getSituacaoConta() {
        return this.situacaoConta;
    }

    public void cancelar() {
        if (this.situacaoConta != SituacaoConta1.PENDENTE)
            System.out.println("Não se pode cancelar uma conta que esteja cancelada ou paga");
        else
            this.situacaoConta = SituacaoConta1.CANCELADA;
    }
}
