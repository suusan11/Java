package day6;

//クラスMinMaxのメンバ関数max(),min()の引数の数を3つにし、
//3つの数の最大値・最小値を出せるようにプログラムを改造しなさい。


public class Prob1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Prob1_Minmax m = new Prob1_Minmax();
	        int a = 4, b = 2, c = 7;
	        System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + m.max(a,b,c));
	        System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + m.min(a,b,c));
	    
	}
}
