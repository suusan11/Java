package day4;

//forの二重ループを用いて、以下のように九九の表を作りなさい。

public class prob16 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
            System.out.print(i + "*" + j + "=" + i * j + " ");
        }
            System.out.println("");
        }
	}
}
