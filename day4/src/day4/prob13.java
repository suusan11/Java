package day4;

//1から10までの乱数を発生させ、もしも5以上だったらその数だけ★マークを表示し
//5未満だったらその数を表示するプログラムを作りなさい。

public class prob13 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
        for (int i = 1; i <=num; i++) {
        	if(num >= 5) {
        		System.out.print("★");
        	}
        }
	}
}

