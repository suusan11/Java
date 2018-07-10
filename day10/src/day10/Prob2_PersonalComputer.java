package day10;

public class Prob2_PersonalComputer extends Prob2_Computer{

	public Prob2_PersonalComputer(){
        super("パーソナルコンピュータ");
    }
    //  入力処理
    public void input(){
        System.out.println("キーボード・マウスで入力");
    }
    //  出力処理
    public void output(){
        System.out.println("ディスプレイに出力");
    }
    
    public void communication(){
        System.out.println("インターネットで通信");
    }
}
