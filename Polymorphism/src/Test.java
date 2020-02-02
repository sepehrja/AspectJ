public class Test {

	public static void face(Noble noble) {
		((Free)noble).declare();
	}
	
	public static void main(String[] args) {


		Human Tyrion = new Noble("Tyrion", "Lannister");	// Static type checking OK
		Noble Arya = new Free("Arya");
		Faceless Jaqen = new Free("Jaqen H'ghar");
		Noble Jon = new NightsWatch("Jon Snow");
		//Faceless Syrio = new Noble();   // compilation fail
		
		Tyrion.speak();				// Overriding
		Tyrion.whatAmI();			// hiding
		//((Commoner)Tyrion).speak();// explicit casting non valid
		
		((Free)Arya).declare();	// explicit casting OK
		
		System.out.println(Jaqen.declare("Valar dohaeris."));	// overloading
		
		Jon.speak();	// overriding
		//((Free)Jon).declare();  // explicit casting non valid
		//face(Tyrion);
		
		
		System.out.println(Jaqen.toString());
		

	}

}
