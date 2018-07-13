package Basic;

public class AnotherClassSample {

	private String name;
	
	AnotherClassSample() {
		System.out.println("This is an AnotherClassSample Constructor!!");
		this.name = "foo";
	}
	
	public void setName(String new_name) {
		name = new_name;
	}
	
	public void printName() {
		System.out.println("My name is " + name + ".");
	}
}
