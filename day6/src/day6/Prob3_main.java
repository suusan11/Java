package day6;

public class Prob3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob3_Circle c = new Prob3_Circle();
        //  円の半径を設定
        c.r = 4.0;
        System.out.println("半径" + c.r +"の円の円周の長さは" + c.circumference());
        System.out.println("半径" + c.r +"の円の面積の長さは" + c.area());
	}

}
