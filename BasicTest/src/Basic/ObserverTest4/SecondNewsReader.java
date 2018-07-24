package ObserverTest4;

import java.util.Observable;
import java.util.Observer;

//second Observer
public class SecondNewsReader implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("SecondNewsReader got the news " + (String)arg);
	}
}
