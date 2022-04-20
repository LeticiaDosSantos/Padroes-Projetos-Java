
public class LojaCarros {

	SimpleCarroFactory factory;
	
	public LojaCarros(SimpleCarroFactory factory) {
		this.factory = factory;
	}
	
	public void pedirCarro(String type) {
		Carro carro;
		carro = factory.createCarro(type);
		carro.enviaMontagem();
		carro.escolheCombustivel();
		carro.adicionaAcessorio();
		carro.escolheCor();	
	}
}
