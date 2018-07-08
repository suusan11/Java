package day4;

//ループを用いて1から100までの数字を表示しなさい。ただし、このとき、数は10ごとに改行すること。


public class prob15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 100; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println((i*10)+j);
			}
		}
	}

}
