
public class ReinoTest {

	public static void main(String[] args) {
		Rainha rainha = new Rainha();
		rainha.lutar();
		rainha.atribuiArma();
		rainha.arma.usarArma();
		System.out.println("");
		
		Rei rei = new Rei();
		rei.lutar();
		rei.atribuiArma();
		rei.arma.usarArma();
		System.out.println("");
		
		Personagem duende = new Duende();
		duende.lutar();
		duende.atribuiArma();
		duende.arma.usarArma();
		System.out.println("");
		
		Personagem guerreiro = new Guerreiro();
		guerreiro.lutar();
		guerreiro.atribuiArma();
		guerreiro.arma.usarArma();
		System.out.println("");
		

	}

}
