
public class TestePizzaria {

	public static void main(String[] args) {
		SimplePizzaFactory spf = new SimplePizzaFactory();
		PizzaStore ps = new PizzaStore(spf);
		ps.orderPizza("CHEESE");
		ps.orderPizza("pepperoni");
	}
}
