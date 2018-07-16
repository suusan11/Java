package Basic;

public class ListB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[][] earnings = new int[3][];
		
		earnings[0] = new int[] { 100, 140, 200, 150};
		earnings[1] = new int[] { 130, 120, 150, 200};
		earnings[2] = new int[] { 110, 170, 160, 180};
		
		int sum = 0;
		
		for(int i = 0; i < earnings.length; i ++) {
			System.out.print((i + 1) + "年目: ");
			int sumYear = 0;
			for(int j = 0; j < earnings[i].length; j++) {
				System.out.print(earnings[i][j] + " ");
				sumYear += earnings[i][j];
			}
			System.out.println("合計: " + sumYear);
			sum += sumYear;
		}
		
		System.out.println("総計: " + sum);
	}

}
