package Basic;

public class ClassSample {
	
	private String msg;
	
	ClassSample() {
		System.out.println("This is a ClassSample Constructor!");
	}
	
	public void setMassege(String inMsg) {
		msg = inMsg;
	}
	
	public void printMassege() {
		System.out.println("massege: " + msg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//class ClassSampleのインスタンス作成、コンストラクタ呼び出し
		ClassSample classSample = new ClassSample();
		
		//引数を入れてsetMassegeメソッドを呼び出し
		classSample.setMassege("Hello Java World");
		//printMassegeメソッドを呼び出し
		classSample.printMassege();
		
		//class AnotherClassSampleのインスタンス作成、コンストラクタ呼び出し
		AnotherClassSample anotherClassSample = new AnotherClassSample();
		//printNameメソッドを呼び出し
		anotherClassSample.printName(); //nameの初期化がfooなのでそれで出力される
		//setNameメソッドを呼び出し、nameに違う値（bar）を代入
		anotherClassSample.setName("bar");
		//printNameメソッドを呼び出し
		anotherClassSample.printName(); //上で変えた値を持って出力される
	}

}
