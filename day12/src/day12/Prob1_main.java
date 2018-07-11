package day12;
import java.util.*;

//　0〜10までの乱数を出力し、0が出たら終了。
//　それまでの数字を奇数、偶数に分けてArrayListで作った可変長配列の中に格納し出力。

public class Prob1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int [10];
		ArrayList <Integer> odd = new ArrayList <Integer> ();
		ArrayList <Integer> even = new ArrayList <Integer> ();
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10);
			System.out.print(num[i] + " ");
			
			if(num[i] == 0) {
				break;
			}
			
			if(num[i] % 2 == 0) {
				even.add(num[i]);
			}else {
				odd.add(num[i]);
			}
		}
		
		System.out.println(" ");
		System.out.print("偶数：");
		System.out.println(even);
		System.out.print("奇数：");
		System.out.println(odd);
		
	}
}
