
public class Test {
	  public static void main(String[] args) {
		    Semaphore semaphore = new Semaphore();
		    semaphore.increment();
		    semaphore.increment();
		    semaphore.decrement();
		    System.out.println(semaphore.getValue());
		  }
  }