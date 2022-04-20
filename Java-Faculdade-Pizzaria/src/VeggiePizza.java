public class VeggiePizza extends Pizza {

	@Override
	public void prepare() {
		super.prepare();
		System.out.println("Queijo, palmito, milho e ervilha");
	}

}