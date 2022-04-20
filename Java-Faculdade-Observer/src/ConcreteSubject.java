import java.util.ArrayList;
import java.util.Iterator;

public class ConcreteSubject implements Subject {

	private ArrayList observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public ConcreteSubject() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);

		if (i >= 0)
			observers.remove(i);
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}

	public void getValor(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		ValorChanged();
	}
	
	public void ValorChanged() {
		notifyObserver();
	}

}
