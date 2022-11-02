package aula25.desafio;

public class Principal {

    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        // instanciando clientes
        ClienteDesafio atacadista = new ClienteDesafio();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        ClienteDesafio telecom = new ClienteDesafio();
        telecom.setNome("FoneNet Telecomunicações");

        // instanciando contas a pagar
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);

        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);

        ContaReceber contaReceber = new ContaReceber();
        contaReceber.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber.setValor(0d);
        contaReceber.setDataVencimento("23/05/2012");
        contaReceber.setCliente(atacadista);
        try {
            contaReceber.receber();
        } catch (OperacaoContaException e) {
            System.out.println(e.getMessage());
        }

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",
                53200d, "13/05/2012");

        // exibe listagem de todas as contas com detalhamento
        RelatorioContas relatorio = new RelatorioContas();
        Conta1[] contas = new Conta1[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};

        relatorio.exibirListagem(contas);
    }

}