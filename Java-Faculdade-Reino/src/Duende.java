
public class Duende extends Personagem {

	@Override
	public void lutar() {
		System.out.println("Duende est� lutando ");
	}

	@Override
	public void atribuiArma() {
		
		arma = new Faca();
		System.out.println(this.getClass().getName() + " ganhou " + arma.getClass().getName());
	}

}
