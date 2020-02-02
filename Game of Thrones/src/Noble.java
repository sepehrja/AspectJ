
public class Noble extends Human {
	String house;
	
	public Noble(String name, String house) {
		super(name);
		this.house = house;
	}

	public String toString() {
		return "I am " + this.name + ".";
	}

}
