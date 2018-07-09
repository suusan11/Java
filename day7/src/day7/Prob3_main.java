package day7;

public class Prob3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prob3_Calculation c = new Prob3_Calculation();
        c.setNumber1(8);  
        c.setNumber2(9);  
     
        System.out.println(c.getNumber1() + " + " + c.getNumber2() + " = " + c.add());
        System.out.println( c.getNumber1() + " - " + c.getNumber2() + " = " + c.sub());
	}

}
