import java.util.*;

public class Test {


	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();
		lst.add("one");
		lst.add("one");
		lst.add("two");
		System.out.print("\t" + lst + "\n");
		 
		ArrayList<String> arrlst = new ArrayList<String>();
		arrlst.add("un");
		arrlst.add("deux");
		System.out.print("\t" + arrlst + "\n");		


		Set<String> set = new HashSet<String>();
		set.add("ein");
		set.add("ein");
		set.add("zwei");
		System.out.print("\t" + set + "\n");


	}

}
