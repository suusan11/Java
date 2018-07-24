package ObserverTest4;

import java.util.Observable;
import java.util.Observer;

//first Observer
public class FirstNewsReader implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("FirstNewsReader got the news " + (String)arg);
	}

	
}
