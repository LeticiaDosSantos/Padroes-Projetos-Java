
public class ObserverTest {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();

		DivObserver divObserver = new DivObserver(concreteSubject);
		ModObserver modObserver = new ModObserver(concreteSubject);

		concreteSubject.getValor(80, 65, 30.4f);
		concreteSubject.getValor(82, 70, 29.2f);
		concreteSubject.getValor(78, 90, 29.4f);
	}
}
