
import java.util.*;
public class CastingTest {
	
	public static void trim(List lst) {
		((LinkedList)lst).removeFirst();
	}
	
	public static void main(String[] args) {
		//LinkedList<String> list = new LinkedList<String>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		trim(list);
		System.out.println(list.contains("a"));
		System.out.println(list.contains("b"));
	}	
}