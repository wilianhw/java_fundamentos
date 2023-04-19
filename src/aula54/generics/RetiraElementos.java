package aula54.generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T retiraElemento(List<T> list) {
        return list.get(0);
    }
}
