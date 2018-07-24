package ObserverTest4;

import java.util.Observable;

//observed class
public class News extends Observable{

	public void news() {
		String[] news = {"News 1", "News 2"};
		
		for(String s: news) {
			setChanged();
			notifyObservers(s);
		}
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error Occurred.");
        }
	}
}
