
public class Rei extends Personagem {

	@Override
	public void lutar() {
		System.out.println("Rei est� lutando ");
	}

	@Override
	public void atribuiArma() {
		
		arma = new Espada();
		System.out.println(this.getClass().getName() + " ganhou " + arma.getClass().getName());
	}

	
}
