package day10;

public class Prob2_TabletPC extends Prob2_Computer{

	public Prob2_TabletPC() {
		super("タブレットPC");
	}
	
	public void input() {
		System.out.println("タッチパネルディスプレイをタップして操作");
	}
	
	public void output() {
		System.out.println("タッチパネルディスプレイに出力");
	}
	
	public void communication(){
        System.out.println("インターネットで通信");
    }
}
