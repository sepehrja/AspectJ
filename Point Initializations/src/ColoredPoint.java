
public class ColoredPoint extends Point {

	public String color;

	public ColoredPoint () {
		super();
		System.out.println(">Entry: Default constructor.");
		this.color = "Black";
		System.out.println(">Exit: Default constructor.");
	}
	
	public ColoredPoint (float x, float y, String color) {
		super(x, y);
		System.out.println(">Entry: Non-default constructor.");
		this.color = color;
		System.out.println(">Exit: Non-default constructor.");
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ") : " + this.color;
	}
	
	
}
