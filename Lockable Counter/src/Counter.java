
public class Counter {
  private static String description = "A counter.";
  int element;
  public void click() {
    element++;
  }
  public int getValue() {
    return element;
  }
  public void reset() {
    this.element = 0;
  }
  public static String getDescription() {
    return description;
  }
}