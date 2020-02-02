
// C. Constantinides, 2012.

public class Android extends Machine {

	public int version;
	
	Android (int version) {
		this.version = version;
	}
	
	public String whatIhave() {
		return "I have physical power.";
	}
	
	
	
	public static String whatIneed() {
		return "I need more time.";
	}
	
	
	
	public String act() {
		return "I am an android and I can act.";
	}
	
	public String reason() {
		return "I am an android and I can reason.";
	}
}
