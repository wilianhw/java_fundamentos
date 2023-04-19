package aula54.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Teste"));
        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");

        String nome = RetiraElementos.retiraElemento(nomes);
        System.out.println(nome);

        Funcionario funcionario = RetiraElementos.retiraElemento(funcionarios);
        System.out.println(funcionario.getNome());
    }
}
