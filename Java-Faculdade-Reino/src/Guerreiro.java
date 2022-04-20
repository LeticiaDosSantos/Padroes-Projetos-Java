
public class Guerreiro extends Personagem {

	@Override
	public void lutar() {
		System.out.println("Guerreiro está lutando ");
	}

	@Override
	public void atribuiArma() {
		
		arma = new Machado();
		System.out.println(this.getClass().getName() + " ganhou " + arma.getClass().getName());
	}

}
