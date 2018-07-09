package day5;
import java.lang.Math;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] data = new int [10];
		int [] odd = new int [10];
		int [] even = new int [10];
		int i;
		
		for(i = 0; i <= data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
			System.out.print(data[i] + " ");
			System.out.print("");
		}
		
		System.out.print("奇数：");
		for(i  =0; i <= data.length; i++) {
			if(data[i] % 2 != 0) {
				data[i] = (int)(Math.random()*100)+1;
				odd[i] = data[i];
				System.out.print(odd[i]);
				//System.out.println(odd);
			}else {
				even[i] = data[i];
			}
		}
			
			System.out.println(odd[i]);
			System.out.println(even[i]);
		
	
//		 
//				even = num;
//				System.out.println("偶数： " + even);
//		}

		//}
	}
}
