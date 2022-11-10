package aula45.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPeloNome {

    public static void main(String[] args) {
        PessoaComparator p1 = new PessoaComparator("João", 21);
        PessoaComparator p2 = new PessoaComparator("Maria", 22);
        PessoaComparator p3 = new PessoaComparator("Carla", 23);

        List<PessoaComparator> pessoas = Arrays.asList(p1, p2, p3);
        Collections.sort(pessoas);

        for (PessoaComparator pessoa: pessoas)
            System.out.println(pessoa);
    }
}
