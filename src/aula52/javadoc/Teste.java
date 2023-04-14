package aula52.javadoc;

import aula52.javadoc.modelo.Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("teste");
        Funcionario funcionario = new Funcionario("João", 5000.0);

        funcionario.adiantamentoViagem(10, true);
    }
}
