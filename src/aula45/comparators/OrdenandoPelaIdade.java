package aula45.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
    public static void main(String[] args) {
        PessoaComparator p1 = new PessoaComparator("João", 21);
        PessoaComparator p2 = new PessoaComparator("Maria", 22);
        PessoaComparator p3 = new PessoaComparator("Carla", 23);

        List<PessoaComparator> pessoas = Arrays.asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();
        // Maneira antiga
        // Collections.sort(pessoas, idadeComparator);
        // Java 8
        pessoas.sort(idadeComparator);

        for (PessoaComparator pessoa : pessoas)
            System.out.println(pessoa);
    }
}
