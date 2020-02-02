
import java.util.*;

public class StackAPITest {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("first");
		s.push("second");
		s.push("third");
		System.out.println(s.elementAt(0));
	}
}