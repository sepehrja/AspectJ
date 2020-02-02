// C. Constantinides, 2009.

public class Labrador extends Dog implements Guide {
	String description = "I am a type of gun dog.";
	static int lifeSpan = 14;
	
	public Labrador () {}
	
	public Labrador (String name) {
		super(name);
	}
	
	public void describe() {
		System.out.println("I am athletic and playful and " + super.description);
	}
	
	public void whatIdo() {
		System.out.println("I retrieve game for a hunter.");
	}

	public void navigate() {
		System.out.println("I am trained to aid blind and autistic people.");
	}
	
	public void work() {
		System.out.println("I can track, I can detect and I can do therapy work.");
	}
	
	public String goAfter() {
		return "thieves";
	}
}
