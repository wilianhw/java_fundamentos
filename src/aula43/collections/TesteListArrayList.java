package aula43.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    public static void main(String[] args) {
        AlunoCollections a1 = new AlunoCollections("João");
        AlunoCollections a2 = new AlunoCollections("Maria");
        AlunoCollections a3 = new AlunoCollections("José");
        AlunoCollections a4 = new AlunoCollections("Pedro");

        List<AlunoCollections> alunos = new ArrayList<AlunoCollections>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a4);

        imprimirAlunoCollections(alunos);
    }

    public static void imprimirAlunoCollections(List<AlunoCollections> alunos) {
        for (AlunoCollections a : alunos) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
