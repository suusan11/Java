package day10;

public abstract class Prob1_AirPlane {

	private String type;
	
	Prob1_AirPlane(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	abstract void fly();
}
