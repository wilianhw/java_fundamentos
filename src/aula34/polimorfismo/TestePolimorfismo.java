package aula34.polimorfismo;

public class TestePolimorfismo {

    public static void main(String[] args) {
        ContaPolimorfismo conta = new ContaPolimorfismo();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        System.out.println();
        //--------------------------------------------------
        ContaPolimorfismo contaCorrente = new ContaPolimorfismoCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        //--------------------------------------------------
        ContaPolimorfismo contaPoupanca = new ContaPolimorfismoPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    public static void imprimirSaldo(ContaPolimorfismo conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        if (conta instanceof ContaPolimorfismoCorrente) {
            ContaPolimorfismoCorrente cc = (ContaPolimorfismoCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }

        if (conta instanceof ContaPolimorfismoPoupanca) {
            ContaPolimorfismoPoupanca cp = (ContaPolimorfismoPoupanca) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }
}
