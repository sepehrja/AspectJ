
public class Free extends Noble implements Faceless {
	
	public Free(String name) {
		super(name, "no house");
	}
	public void declare() {
		System.out.println("Valar morghulis.");
	}
	
	public String declare(String str) {
		return str;
	}

}
