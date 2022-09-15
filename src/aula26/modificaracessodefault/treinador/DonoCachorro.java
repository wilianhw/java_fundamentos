package aula26.modificaracessodefault.treinador;

import aula26.modificaracessodefault.animal.Cachorro;

public class DonoCachorro {
    // Modificar de acesso default
    // Os metodos só podem ser chamados dentro do mesmo pacote.
    void ensinarCachorroSentara(Cachorro cachorro) {
        cachorro.sentar();
    }
}
