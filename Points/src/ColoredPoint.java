
public class ColoredPoint extends Point {

	String color;

	public ColoredPoint(double x, double y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColoredPoint() {
		super(0., 0.);
		this.color = "black";
	}
	
	  public String toString() {
		    return "x: " + x + ", y: " + y + ", color: " + color + ".";
		  }

}
