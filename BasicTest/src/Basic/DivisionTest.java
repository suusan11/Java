package Basic;

//例外に対処する

public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int answer;
		
		try {
			// 引数を数値に変換する
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			
			//class DivisionProcessのインスタンスを生成し、コンストラクタを呼ぶ
			DivisionProcess dp = new DivisionProcess();
			//クラスメソッドで呼び出した値をanswerに代入する
			answer = dp.divide(x,y);
		}
		catch (NumberFormatException ex) {
			 // 数値ではない文字列が指定された場合の処理
			System.out.println("エラー:数値ではありません!!");
            return;
		}
		catch (ArithmeticException ex) {
			// ゼロで割ろうとしたときの処理
			System.out.println("エラー:0では割れません!!");
            return;
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			 // 引数が足りなかったときの処理
			System.out.println("エラー:引数が足りません!!");
            return;
		}
		//結果を表示する
		System.out.println(x + " / " + y + " = " + answer);
	}

}
