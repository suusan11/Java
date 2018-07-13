package Basic;

public class OverLoadTest {

	private String displayName_;
	
	public void OverLoad() {
		this.displayName_ = null;
	}
	
	// 表示名称設定
	public void setName(String name) {
		displayName_ = name;
	}
	
	// 設定名称表示メソッド
	public void printName() {
		printName(displayName_);
	}
	
	// 指定名称表示メソッド（苗字、名前）
	public void printName(String lastName, String firstName) {
		String name = lastName + firstName;
		printName(name);
	}
	
	// 指定名称表示メソッド
	public void printName(String name) {
		String line = "私は" + name + "です";
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadTest overLoadTest = new OverLoadTest();
		
		 // 表示する名称を設定する
		overLoadTest.setName("山田");
		// 上で設定した名称を表示する
		overLoadTest.printName();
		
		 // 指定名称表示メソッド（苗字、名前）を引数を入れて呼び出す
		overLoadTest.printName("山田　", "太郎");
		
		// 指定名称表示メソッドを引数を入れて呼び出す
		overLoadTest.printName("山田　太郎");
	}

}
