package day10;

public abstract class Prob2_Computer {

	private String type;
   
    public Prob2_Computer(String type){
        this.type = type;
    }
  
    public abstract void input();
  
    public abstract void output();
 
    public void communication(){
        System.out.println("インターネットで通信");
    }
 
    public void showType(){
        System.out.println("コンピュータの種類:" + type);
    }
}
