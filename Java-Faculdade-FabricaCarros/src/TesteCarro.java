
public class TesteCarro {

	public static void main(String[] args) {
		SimpleCarroFactory scf = new SimpleCarroFactory();
		LojaCarros cs = new LojaCarros(scf);
		cs.pedirCarro("celta");
		cs.pedirCarro("cruze");
		cs.pedirCarro("classic");
		cs.pedirCarro("captiva");
	}
}
