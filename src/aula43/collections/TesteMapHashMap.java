package aula43.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

    public static void main(String[] args) {
        AlunoCollections a1 = new AlunoCollections("João");
        AlunoCollections a2 = new AlunoCollections("Maria");
        AlunoCollections a3 = new AlunoCollections("José");
        AlunoCollections a4 = new AlunoCollections("Pedro");

        Map<String, AlunoCollections> alunos = new HashMap<String, AlunoCollections>();

        alunos.put("1", a1);
        alunos.put("2", a2);
        alunos.put("3", a3);
        alunos.put("4", a4);
        alunos.put("5", a4);

        imprimirAlunoCollections(alunos);

        AlunoCollections alunoRecuperado = alunos.get("3");
        System.out.println("AlunoCollections de chave 3: " + alunoRecuperado.getNome());
    }

    private static void imprimirAlunoCollections(Map<String, AlunoCollections> alunos) {
        for (AlunoCollections a : alunos.values()) {
            System.out.println("Nome: " + a.getNome());
        }
    }
}
