package day9;

public class Prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob2_NewCalc n = new Prob2_NewCalc();
        n.setNumber1(10);  
        n.setNumber2(2);    
        System.out.println(n.getNumber1() + " + " + n.getNumber2() + " = " + n.add());
        System.out.println(n.getNumber1() + " - " + n.getNumber2() + " = " + n.sub());
        System.out.println(n.getNumber1() + " * " + n.getNumber2() + " = " + n.mul());
        System.out.println(n.getNumber1() + " / " + n.getNumber2() + " = " + n.div());
        
	}

}
