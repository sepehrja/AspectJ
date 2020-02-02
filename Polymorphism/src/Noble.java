
public class Noble extends Human {
	
	String house;
	
	public Noble(String name, String house) {
		this.name = name;
		this.house = house;
	}
	public Noble(String name) {
		this.name = name;
	}
	public void speak() {
		System.out.println("Yes, my lord.");
	}
	public String toString() {
		return "I am " + this.name + " of " + this.house + ".";
	}

}
