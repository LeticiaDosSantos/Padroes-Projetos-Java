
public class Captiva extends Carro{

	@Override
	public void adicionaAcessorio() {
		super.adicionaAcessorio();
		System.out.println("Captiva");
	}

	@Override
	public void escolheCombustivel() {
		super.escolheCombustivel();
		System.out.println("Captiva");
	}

	@Override
	public void escolheCor() {
		super.adicionaAcessorio();
		System.out.println("Captiva");
	}

	@Override
	public void enviaMontagem() {
		System.out.println("");
		System.out.print("Captiva");
		super.enviaMontagem();
	}
}
