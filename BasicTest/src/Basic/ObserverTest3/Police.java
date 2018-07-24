package ObserverTest3;

import java.util.Observable;
import java.util.Observer;

public class Police implements Observer {

	@Override
	public void update(Observable o, Object event) {
		System.out.println("おまわりさん通報を受ける");
		
		if(event instanceof Shoplift) {
			System.out.println("逮捕");
		}
	}
}
