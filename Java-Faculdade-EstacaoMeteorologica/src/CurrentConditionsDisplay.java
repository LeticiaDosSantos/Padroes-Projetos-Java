
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature, humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out
				.println("\nCurrent Conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity.");
	}
}
