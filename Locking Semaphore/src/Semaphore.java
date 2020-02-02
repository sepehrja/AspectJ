public class Semaphore {
  private int value;
  public void increment() {
	  this.value++;
  }
  public void decrement() {
	  this.value--;
  }
  public int getValue() {
    return this.value;
  }
  public void reset() {
	    this.value = 0;
	  }
}
