// C. Constantinides, 2009.

public class Dog extends Animal implements Hunter {
	
	String description = "I am the first domesticated animal.";
	static int lifeSpan = 12;
	
	public Dog () {}
	
	public Dog (String name) {
		super(name);
	}
	
	public void describe() {
		System.out.println(description);
	}

	public String whatIdo(String str) {
		return"I like to " + str + ".";
	}
	
	public String goAfter(String str) {
		return str;
	}
	
}
