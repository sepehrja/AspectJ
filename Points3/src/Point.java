
public class Point {
 protected double x, y;
 public Point(double x, double y) {
  this.x = x;
  this.y = y;
 }
 public Point() {
  this(0, 0);
 }
 public void move(double x, double y) {
	 this.x = x;
	 this.y = y;
 }
 public String toString() {
  return "x: " + x + " " + "y: " + y;
 }
}
