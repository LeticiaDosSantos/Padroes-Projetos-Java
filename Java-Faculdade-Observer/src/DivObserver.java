
public class DivObserver implements Observer {

	private double temperature, humidity;
	private Subject weatherData;

	public DivObserver(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display(); //Ciente de que a chamada do método não era exigida no exercício
	}

	public void display() { //Ciente de que o método não era exigido no exercício
		System.out.println(
				"\nCurrent Conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity.");
	}

}
