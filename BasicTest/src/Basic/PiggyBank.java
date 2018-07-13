package Basic;

public class PiggyBank {
	
	//貯金箱に入っている金額＝フィールド
	public int totalMoney = 0;
	
	//貯金箱にお金を入れる＝メソッド（返り値なし）
	public void putCoin(int money) {
		//フィールドtotalMoneyにputCoinメソッドで入力するmoneyを足していきますよ
		totalMoney = totalMoney + money;
		System.out.println("貯金箱に" + money + "円入れました");
	}
	
	//貯金箱を壊してお金を取り出す＝メソッド（返り値int）
	public int breakPiggyBank() {
		System.out.println("ガシャン");
		return totalMoney;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//貯金箱インスタンスを作る＝定義したクラスを使う準備が整う
		PiggyBank bank = new PiggyBank();
		
		//貯金箱にお金を入れる＝「putCoin」メソッドを呼び出す
		bank.putCoin(100);
		bank.putCoin(50);
		
		//貯金箱を壊してお金を取り出す
		int money = bank.breakPiggyBank();	//moneyにtotalMoneyの値を代入
		System.out.println("貯金箱から" + money + "円出しました");
	}

}
