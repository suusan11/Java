package day10;

public class Prob1_main {
	public static void main(String[] args) {
       
		
        Prob1_FighterAiracraft fighter = new Prob1_FighterAiracraft();
        Prob1_PassengerPlane airlinear = new Prob1_PassengerPlane();
       
        fighter.fly();                 
        fighter.fight();             
        //  旅客機クラスの処理
        airlinear.fly();              
        airlinear.carryPassengers();  
 
    }
}
