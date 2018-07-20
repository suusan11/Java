package Basic;

import java.util.Observable;

public class ObservableTest extends Observable{

	private String weather;
	
	public ObservableTest(String weather) {
		this.weather = weather;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers();
	}
	
	
	
}
