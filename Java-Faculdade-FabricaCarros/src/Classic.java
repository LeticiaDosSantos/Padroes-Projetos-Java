
public class Classic extends Carro{

	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Classic");
	}

	@Override
	public void escolheCombustivel() {
		super.escolheCombustivel();
		System.out.println("Classic");
	}

	@Override
	public void escolheCor() {
		super.adicionaAcessorio();
		System.out.println("Classic");
	}

	@Override
	public void enviaMontagem() {
		System.out.println("");
		System.out.print("Classic");
		super.enviaMontagem();
	}
}
