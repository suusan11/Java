package day10;

public class Prob1_PassengerPlane extends Prob1_AirPlane{

	public Prob1_PassengerPlane() {
		super("旅客機");
	}
	
    public void fly(){
        System.out.println("乗客を乗せて目的地まで飛行します。");
    }
    //  戦闘する
    public void carryPassengers(){
        System.out.println("乗客を目的地まで運びます。");    
    }
}
