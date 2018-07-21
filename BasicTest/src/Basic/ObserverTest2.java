package Basic;

import java.util.Observable;
import java.util.Observer;

//observer using nested class

public class ObserverTest2 {

	public static void main(String[] args) {
		
		new ObserverTest2();
	}

		/*コンストラクタ*/
		ObserverTest2() {
			//観察される人のインスタンスを作成
			ObservableMan observableMan = new ObservableMan();
			
			//観察する人を2人追加
			observableMan.addObserver(new ObserverA());
			observableMan.addObserver(new ObserverB());
			
			 //観察者全員に追加
			observableMan.notifyObservers("うふふ");
		}
		
		/*観察される人のクラス*/
		class ObservableMan extends Observable {
			
			//直前に与えられた引数
			private String previousArg = null;
			
			//観察者に通知
			
			public void notifyObservers(Object arg) {
				String str = (String)arg;
				
				//直前に与えられた引数と同じならそのままリターン
				if(str.equals(previousArg)) {
					return;
				}
				
				previousArg = str;
				
				setChanged();
				
				//通知
				super.notifyObservers(str);
				clearChanged();
				
			}
		}
		
		/*観察者を観察する人Aのクラス*/
		class ObserverA implements Observer {
			public void update(Observable o, Object arg) {
				String str = (String)arg;
				System.out.println("Aです。観察してるよ。" + str);
			}
		}
		
		/*観察者を観察する人Bのクラス*/
		class ObserverB implements Observer {
			public void update(Observable o, Object arg) {
				String str = (String)arg;
				System.out.println("Bです。観察してるよ。" + str);
			}
		}

}
