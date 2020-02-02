
public class Test {

	  public static void main(String[] args) {
		    Buffer2 buffer = new Buffer2(5);
		    buffer.put("all");
		    buffer.put("your");
		    buffer.put("base");
		    buffer.put("are");
		    buffer.put("belong");
		    System.out.println(buffer.gget());
		    System.out.println(buffer.gget());
		    System.out.println(buffer.get());
		    System.out.println(buffer.gget());
		    buffer.put("to");
		    buffer.put("us");
		    System.out.println(buffer.gget());
		    System.out.println(buffer.get());
		    System.out.println(buffer.get());
		    System.out.println(buffer.gget());
		    System.out.println(buffer.get());
		    System.out.println(buffer.get());
		  }
}
