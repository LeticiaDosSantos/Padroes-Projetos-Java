
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
		display(); //Ciente de que a chamada do m�todo n�o era exigida no exerc�cio
	}

	public void display() { //Ciente de que o m�todo n�o era exigido no exerc�cio
		System.out.println(
				"\nCurrent Conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity.");
	}

}
