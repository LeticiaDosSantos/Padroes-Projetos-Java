
public class DecoratorTest {

	public static void main(String[] args) {
		
		Beverage expresso = new Expresso();
		System.out.println(expresso.getDescription() + " $" + expresso.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

	}

}
