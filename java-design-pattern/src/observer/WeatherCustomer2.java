package observer;

public class WeatherCustomer2 implements WeatherObserver {

	public void doUpdate(int temperature) {
		System.out.println("WeatherCustomer2 temperature is:" + temperature);
	}

}
