package day10;

public class Prob2_main {

	public static void main(String[] args) {
        Prob2_Computer[] cp = new Prob2_Computer[3];
        cp[0] = new Prob2_PersonalComputer();     
        cp[1] = new Prob2_TabletPC();             
        cp[2] = new Prob2_SmartPhone();           
        for(Prob2_Computer c:cp){
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
        }
    }
}
