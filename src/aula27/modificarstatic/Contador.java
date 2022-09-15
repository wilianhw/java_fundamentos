package aula27.modificarstatic;

public class Contador {
    public static Integer count = 0;

    public static final Integer CONST_COUNT = 1;

    public void incrementar() {
        this.count++;
    }

}
