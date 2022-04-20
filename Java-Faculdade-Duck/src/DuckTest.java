
public class DuckTest {

	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new MuteQuack());
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("");
		
		RubberDuck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		
		System.out.println("");
		
		RedHeadDuck redHead = new RedHeadDuck();
		redHead.display();
		redHead.performFly();
		redHead.performQuack();
		redHead.setFlyBehavior(new FlyNoWay());
		redHead.setQuackBehavior(new MuteQuack());
		redHead.display();
		redHead.performFly();
		redHead.performQuack();
		
		System.out.println("");
		
		DecoyDuck decoy = new DecoyDuck();
		decoy.display();
		decoy.setFlyBehavior(new FlyNoWay());
		decoy.setQuackBehavior(new MuteQuack());
		decoy.performFly();
		decoy.performQuack();
	}

}
