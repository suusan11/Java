package Basic;
//文字入力
import java.io.*;

public class StreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//指定された所（System.in）から1文字分のデータを読みとる
		InputStreamReader is = new InputStreamReader (System.in); 
		//InputStreamReaderを引数（＝is）として渡すことで、効率よく文字列を入力することができる
		BufferedReader br = new BufferedReader(is); 
		
		System.out.println("何か入力してみてね：　");
		//readLine メソッドを使ってコンストラクタの引数で指定された InputStreamReader を使用し1行単位の文字列を入力できるようする
		String str = br.readLine();
		System.out.println(str + "が入力されました。");
	}

}
