package day7;

public class Prob2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prob2_TwoStrings s = new Prob2_TwoStrings();
        s.setString1("Hello");
        s.setString2("World");
        System.out.println("一つ目の文字列は" + s.getString1());
        System.out.println("二つ目の文字列は" + s.getString2());
        System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
		
	}

}
