package day4;

//1から10までの乱数を発生させ、偶数なら"★"を
//奇数なら"☆"をそれぞれ発生した数の文だけ表示するプログラムを作りなさい。

public class prob14 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
        for (int i = 1; i <=num; i++) {
        	if(num % 2 == 0) {
        		System.out.print("★");
        	}else {
        		System.out.print("☆");
        	}
        }
	}
}
