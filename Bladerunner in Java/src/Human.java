// C. Constantinides, 2012.

public class Human implements Behavior{
	
	public String type = "HUMAN.";
	public boolean empathy = true;

	public String act() {
		return "I am an human and I can act.";
	}
	
	public String reason() {
		return "I am a human and I can reason.";
	}
	
	public boolean hasEmpathy() {
		return empathy;
	}
	
}
