package aula26.modificaracessodefault.treinador;

import aula26.modificaracessodefault.animal.Cachorro;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");

        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentara(cachorro);
    }
}