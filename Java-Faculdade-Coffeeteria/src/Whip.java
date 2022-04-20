
public class Whip extends CondimentDecorator {

	protected Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return 0.45 + beverage.cost();
	}
}
