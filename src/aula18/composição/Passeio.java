package aula18.composição;

public class Passeio {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		
		/* Esse trecho de código comentado, 
		 poderia ser utilizado para substituir 
		 o código "p1.cachorro = new Cachorro();"
		 Cachorro cachorro = new Cachorro()
		 p1.cachorro = cachorro;
		*/
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Bidu";
		p1.cachorro.idade = 3;
		p1.cachorro.raca = "Boxer";
		p1.cachorro.sexo = 'M';
		
		Caminhada c = new Caminhada();
		c.andar(p1);
		
	}
}