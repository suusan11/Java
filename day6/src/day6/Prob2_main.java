package day6;

public class Prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob2_Calc c = new Prob2_Calc();
		double a = 4.0,b = 2.0;
        System.out.println(a + " + " + b + " = " + c.add(a,b));
        System.out.println(a + " - " + b + " = " + c.sub(a,b));
        System.out.println(a + " * " + b + " = " + c.mul(a,b));
        System.out.println(a + " / " + b + " = " + c.div(a,b));
        
	}

}
