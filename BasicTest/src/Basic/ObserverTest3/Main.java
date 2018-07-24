package ObserverTest3;

public class Main {

	public static void main(String[] args) throws Exception{
		Shop shop = new Shop();
		Police police = new Police();
		
		shop.addObserver(police);
		
		shop.seeShoplifter();

	}

}
