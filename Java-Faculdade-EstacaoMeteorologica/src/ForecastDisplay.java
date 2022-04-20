
public class ForecastDisplay implements Observer, DisplayElement {

	private double currentPressure = 29.9;
	private double lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temperature, double humidity, double pressure) {
		this.lastPressure = currentPressure;
		this.currentPressure = pressure;
		display();
	}

	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure)
			System.out.println("Improving weather on the way!");
		else if (currentPressure == lastPressure)
			System.out.println("More of the same");
		else if (currentPressure < lastPressure)
			System.out.println("Watch out for cooler, rainy weather");
	}
}
