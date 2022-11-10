package aula45.comparators;

import java.util.Comparator;

public class IdadeComparator implements Comparator<PessoaComparator> {
    @Override
    public int compare(PessoaComparator p1, PessoaComparator p2) {
        if (p1.getIdade() < p2.getIdade())
            return -1;
        if (p1.getIdade() > p2.getIdade())
            return 1;
        return 0;
    }
}
