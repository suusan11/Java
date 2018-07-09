package day5;
import java.lang.Math;
public class prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int [7];

		for(int i = 0; i <= a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
			System.out.println("a" + "[" + i + "]" + "=" + a[i]);
		}
	}
}
