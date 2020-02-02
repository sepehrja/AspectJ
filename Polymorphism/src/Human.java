
public abstract class Human {

	String name;
	public static String description = "Human";
	public abstract void speak();
	public static void whatAmI() {
		System.out.println("I am " +  description + ".");
	}
	
}
