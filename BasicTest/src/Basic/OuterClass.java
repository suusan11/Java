package Basic;

public class OuterClass {

	private String str = "This is OuterClass";
	
	class InnerClass {
		public void innerSample() {
			System.out.println(str);
		}
	}
}
