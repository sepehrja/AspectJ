
public class Cat extends Animal implements Hunter {
	String description = "I am a domesticated animal";
	protected int lifeSpan = 14;
	
	public Cat () {
		this("Ella");
	}
	
	public Cat (String name) {
		super(name);
	}
	
	public void describe() {
		System.out.println(description);
	}

	public void whatIdo() {
		System.out.println("I hunt vermin and household pests.");
	}
	
	public String goAfter(String str) {
		return str;
	}
}
