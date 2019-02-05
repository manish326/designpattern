package observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WeatherStation implements WeatherSubject {

	Set<WeatherObserver> weatherObservers;
	int temperature;

	public WeatherStation(int temperature) {
		weatherObservers = new HashSet<WeatherObserver>();
		this.temperature = temperature;
	}

	public void addObserver(WeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);
	}

	public void removeObserver(WeatherObserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
	}

	public void setTemperature(int newTemperature) {
		System.out.println("Weather station setting temperature to " + newTemperature);
		temperature = newTemperature;
		doNotify();
	}
	
	public void doNotify() {
		Iterator<WeatherObserver> it = weatherObservers.iterator();
		while (it.hasNext()) {
			WeatherObserver weatherObserver = it.next();
			weatherObserver.doUpdate(temperature);
		}
	}
}
