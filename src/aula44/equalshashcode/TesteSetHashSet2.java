package aula44.equalshashcode;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<AlunoEqualsHashCode> alunos = SimuladorBancoDeDados.buscarAlunos();

        // De alguma forma, sorteia o nome do aluno e constrói o objeto Aluno
        AlunoEqualsHashCode alunoSorteado = new AlunoEqualsHashCode("Maria");

        if (alunos.contains(alunoSorteado)) {
            System.out.println("Parabéns " + alunoSorteado.getNome() +"! Você ganhou um brinde!");
        } else {
            System.out.println("Aluno não cadastrado no banco de dados.");
        }
    }
}
