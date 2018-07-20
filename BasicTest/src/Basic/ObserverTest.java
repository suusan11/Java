package Basic;

import java.util.Observable;
import java.util.Observer;

public class ObserverTest implements Observer {

	private ObservableTest weatherUpdate;
	
	@Override
	public void update(Observable observable, Object arg) {
		weatherUpdate = (ObservableTest) observable;
		System.out.println("Weather Report Live. Its " + weatherUpdate.getWeather());
	}
	
	public static void main(String[] args) {
		ObservableTest observable = new ObservableTest(null);
		ObserverTest observer = new ObserverTest();
		
		observable.addObserver(observer);
		
		observable.setWeather("Bright and sunny!");
		observable.setWeather("Raining Heavily!");
	}
}
