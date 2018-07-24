package ObserverTest4;

public class Main {

	public static void main(String[] args) {
		News observedNews = new News();
		
		FirstNewsReader reader1 = new FirstNewsReader();
		SecondNewsReader reder2 = new SecondNewsReader();
		
		observedNews.addObserver(reader1);
		observedNews.addObserver(reder2);
		observedNews.news();
	}

}
