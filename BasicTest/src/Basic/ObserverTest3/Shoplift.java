package ObserverTest3;

import java.util.EventObject;

public class Shoplift extends EventObject {
	
	public Shoplift(Object source) {
		super(source);
	}
	
	@Override
	public String toString() {
		return "shop";
	}
}
