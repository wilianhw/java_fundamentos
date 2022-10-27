package aula25.desafio;

public class ContaPagar extends Conta1 {
    private Fornecedor fornecedor;

    public ContaPagar() {
        super();
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

    public void pagar() {
        if (this.situacaoConta != SituacaoConta1.PENDENTE)
            System.out.println("A conta só pode ser paga se a situação for " + SituacaoConta1.PENDENTE);
        else
            this.situacaoConta = SituacaoConta1.PAGA;
        System.out.println("Descricao: " + this.descricao);
        System.out.println("Valor: " + this.valor);
        System.out.println("Data vencimento: " + this.dataVencimento);
        System.out.println("Nome fornecedor: " + this.fornecedor.getNome());
        System.out.println("================================================");
    }
}