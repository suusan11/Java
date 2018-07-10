package day10;

public class Prob2_SmartPhone extends Prob2_Computer{
	public Prob2_SmartPhone() {
		super("スマートフォン");
	}
	
	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}
	
	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}
	
	public void communication(){
        System.out.println("インターネットと電話回線で通信");
    }
}
