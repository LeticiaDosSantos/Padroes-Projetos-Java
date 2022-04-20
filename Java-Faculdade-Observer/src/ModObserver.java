
public class ModObserver implements Observer {

	private double currentPressure = 29.9;
	private double lastPressure;
	private Subject weatherData;

	public ModObserver(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temperature, double humidity, double pressure) {
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		display(); //Ciente de que a chamada do m�todo n�o era exigida no exerc�cio
	}

	public void display() { //Ciente de que o m�todo n�o era exigido no exerc�cio
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure)
			System.out.println("Improving weather on the way!");
		else if (currentPressure == lastPressure)
			System.out.println("More of the same");
		else if (currentPressure < lastPressure)
			System.out.println("Watch out for cooler, rainy weather");
	}
}
