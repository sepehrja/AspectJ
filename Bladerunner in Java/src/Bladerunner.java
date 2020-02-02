// C. Constantinides, 2012.

public class Bladerunner extends Human {
	
	public String type = "BLADERUNNER.";
	public String rank;
	
	public String reason() {
		return "I am bladerunner and I can reason.";
	}
	
	Bladerunner(){}
	
	Bladerunner (String r) {
		this.rank = r;
		String rank = "OFFICER.";
		System.out.println(rank);
	}
	
}
