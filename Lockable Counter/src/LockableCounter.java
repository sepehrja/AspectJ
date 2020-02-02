
public class LockableCounter extends Counter implements Lockable {
  static String description = "A lockable counter.";
  private boolean lock;
  public void lock() {
    this.lock = true;
  }
  public void unlock() {
    this.lock = false;
  }
  public boolean isLocked() {
    return this.lock;
  }
  public void reset() {
    this.element = this.element % 5;
  }
  public static String getDescription() {
    return description;
  }
}
