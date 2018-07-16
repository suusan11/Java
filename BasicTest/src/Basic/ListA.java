package Basic;

public class ListA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {70, 50, 80, 40, 90};
		int sum = 0;
		int ave = 0;
		
		for(int i = 0; i < scores.length; i ++) {
			sum += scores[i];
		}
		
		ave = sum / scores.length;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "人目のスコアは" + scores[i] + "です。");
		}
		
		System.out.println("スコアの合計点は" + sum + "点です。");
		System.out.println("スコアの平均点は" + ave + "点です。");
		
	}

}
