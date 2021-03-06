
public class Soy extends CondimentDecorator {
	
	protected Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return 0.30 + beverage.cost();
	}
}
