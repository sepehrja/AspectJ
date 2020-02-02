
public class Test {

	public static void main(String[] args) {
		  Counter c = new Counter();
		  for (int i = 0; i < 15; i++) {
		    c.increment();
		    System.out.print(c.getValue() + " ");
		  }

	}

}
