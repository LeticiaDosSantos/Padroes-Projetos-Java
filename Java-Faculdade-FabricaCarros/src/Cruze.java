
public class Cruze extends Carro{

	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Cruze");
	}

	@Override
	public void escolheCombustivel() {
		super.escolheCombustivel();
		System.out.println("Cruze");
	}

	@Override
	public void escolheCor() {
		super.adicionaAcessorio();
		System.out.println("Cruze");
	}

	@Override
	public void enviaMontagem() {
		System.out.println("");
		System.out.print("Cruze");
		super.enviaMontagem();
	}
}
