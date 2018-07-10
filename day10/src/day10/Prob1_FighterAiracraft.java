package day10;

public class Prob1_FighterAiracraft extends Prob1_AirPlane{

    public Prob1_FighterAiracraft(){
       super("戦闘機");
    }
  
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
  
    public void fight(){
        System.out.println("戦闘します。");
    }
}
