package ObserverTest3;

import java.util.Observable;

public class Shop extends Observable {

	public void seeShoplifter() {
		Shoplift shopliftevent = new Shoplift(this);
		setChanged();
		notifyObservers(shopliftevent);
	}
	
}
