
public class StatisticsDisplay implements Observer,DisplayElement
{

	private double maxTemperature = 0.0f;
	private double minTemperature = 200;
	private double sumTemperature = 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(double temperature, double humidity, double pressure) {
		this.sumTemperature += temperature;
		numReadings++;
		if(temperature >= maxTemperature)
			this.maxTemperature = temperature;
		else if(temperature < minTemperature)
			this.minTemperature = temperature;
		display();
	}
	
	public void display() {
		System.out.println("Average Temperature = " + (sumTemperature/numReadings));
		System.out.println("Maximum Temperature = " + this.maxTemperature);
		System.out.println("Minimum Temperature = " + this.minTemperature);
	}
}
