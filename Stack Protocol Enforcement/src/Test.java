import java.util.*;

public class Test {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("us");
		s.push("to");
		s.push("belong");
		System.out.println(s.elementAt(0));   // illegal for a stack
		s.push("are");
		s.push("base");
		s.push("your");
		s.push("all");
		System.out.println(s.firstElement()); // illegal for a stack
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.removeElementAt(3);                 // illegal for a stack
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.clear();                            // illegal for a stack
		System.out.println(s.pop());
	}
}
