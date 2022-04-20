
public class Celta extends Carro {

	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Celta");
	}

	@Override
	public void escolheCombustivel() {
		super.escolheCombustivel();
		System.out.println("Celta");
	}

	@Override
	public void escolheCor() {
		super.adicionaAcessorio();
		System.out.println("Celta");
	}

	@Override
	public void enviaMontagem() {
		System.out.println("");
		System.out.print("Celta");
		super.enviaMontagem();
	}
}
