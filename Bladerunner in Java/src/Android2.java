// C. Constantinides, 2012.

public class Android2 extends Android implements Behavior2 {
	
	Android2 (int version) {
		super(version);
	}
	
	Android2() {
		super(8);
	}
	
	public String whatIhave() {
		return "I have an infinite time.";
	}
	
	public boolean hasEmpathy() {
		return empathy;
	}
	
	public boolean hasMemories() {
		return memories;
	}
}
