package aula25.desafio;

public class RelatorioContas {

    public void exibirListagem(Conta1[] contas) {

        for (Conta1 conta: contas) {
            System.out.println("Descrição: " + conta.getDescricao());
            System.out.println("Valor: " + conta.getValor());
            System.out.println("Situação: " + conta.getSituacaoConta());
            System.out.println("Data vencimento: " + conta.getDataVencimento());

            if (conta instanceof ContaPagar) {
                ContaPagar contaPagar = (ContaPagar) conta;
                System.out.println("Nome fornecedor: " + contaPagar.getFornecedor().getNome());
            }

            if (conta instanceof ContaReceber) {
                ContaReceber contaPagar = (ContaReceber) conta;
                System.out.println("Nome cliente: " + contaPagar.getCliente().getNome());
            }
        }
    }
}
