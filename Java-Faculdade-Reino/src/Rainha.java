
public class Rainha extends Personagem {

	@Override
	public void lutar() {
		System.out.println("Rainha está lutando ");
	}

	@Override
	public void atribuiArma() {
		
		arma = new ArcoeFlecha();
		System.out.println(this.getClass().getName() + " ganhou " + arma.getClass().getName());
	}

	
}
