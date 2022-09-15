package aula27.modificarstatic;

public class TesteContador {

    public static void main(String[] args){
        Contador c = new Contador();
        Contador.count++;
        System.out.println(Contador.count);

        c.incrementar();
        System.out.println(Contador.count);

        verificar();
    }

    public static void verificar() {
        System.out.println("O valor do contador é " + Contador.count);
    }
}
