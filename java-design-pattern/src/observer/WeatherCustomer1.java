package observer;

public class WeatherCustomer1 implements WeatherObserver {

	public void doUpdate(int temperature) {
		System.out.println("WeatherCustomer1 temperature is:" + temperature);
	}

}
