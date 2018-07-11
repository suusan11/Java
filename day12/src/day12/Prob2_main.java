package day12;

public class Prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int [10];
				
		System.out.print("Nomal: ");
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10);
			
			System.out.print(num[i] + " ");
			
			if(num[i] == 0) {
				break;
			}
		}
			System.out.println(" ");
			System.out.print("Reverse: ");
			for(int i = num.length; i > 0; i--) {
				System.out.print(num[i - 1] + " ");
			}
	}
}
