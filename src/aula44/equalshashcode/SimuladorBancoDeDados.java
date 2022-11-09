package aula44.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<AlunoEqualsHashCode> buscarAlunos() {
        Set<AlunoEqualsHashCode> alunos = new HashSet<AlunoEqualsHashCode>();
        alunos.add(new AlunoEqualsHashCode("Ricardo"));
        alunos.add(new AlunoEqualsHashCode("Thiago"));
        alunos.add(new AlunoEqualsHashCode("Maria"));

        return alunos;
    }
}
