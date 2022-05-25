public class Principal {
    public static void main(String args[]) {
        Carro carro1 = new Carro();
        carro1.cor = "prata";
        carro1.tipo = "passeio";
        carro1.marca = "Ford";

        Carro carro2 = new Carro();
        carro2.cor = "Branco";
        carro2.tipo = "Corrida";
        carro2.marca = "Civic";

        Dono dono = new Dono();
        dono.nome = "João";
        dono.sexo = "masculino";

        carro1.dono = dono;

        System.out.println("Dono: " + carro1.dono.nome);
        System.out.println("Sexo: " + carro1.dono.sexo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Tipo: " + carro1.tipo);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("----------------------");
        carro1.ligar();
        carro2.ligar();
    }
}