// C. Constantinides, 2009.

public class Test {


	public static void main(String[] args) {

		/*
		 *   Static type checking OK.
		 */
		Dog Max = new Labrador("Max");
		
		/*
		 *   Static type checking not OK.
		 */
		//Labrador Duke = new Animal("Duke");
		
		/*
		 *   Static type checking OK.
		 */
		Guide Buddy = new Labrador("Buddy");
		
		
		/*
		 *   Static type checking OK.
		 */
		Cat Molly = new Cat("Molly");
		
		
		/*
		 *   Static type checking OK.
		 */
		Hunter Oscar = new Cat("Oscar");
		
		
		/*
		 *   Static type checking OK.
		 */
		Hunter Bella = new Dog("Bella");
		
		
		/*
		 *   Static type checking OK.
		 */
		Hunter Rocky = new Labrador("Rocky");
		
		
		
		/*
		 *   Static type checking OK.
		 */
		Hunter MyCat = new Cat();
		
		
		/*
		 *   Static type checking OK.
		 */
		Labrador Luna = new Labrador("Luna");
		
		
		
		/*
		 *   Static type checking OK.
		 */
		Guide Roxy = new Labrador("Roxy");
		
		
		/*
		 *   Static type checking OK.
		 */
		Hunter Zeus = new Labrador("Zeus");
		
		
		
		/*
		 *   Static type checking OK.
		 */
		Animal Bobby = new Labrador("Bobby");
		
		/*
		 *  Compilation fails. Static type checking not successful.
		 */
		//Guide Honey = new Dog("Honey");
		
	
			
		/*
		 *   Hiding
		 */
		System.out.println(Max.lifeSpan);
		
		
		/*
		 *   Overriding
		 */
		Max.describe();
		
		
		
		
		
		/*
		 *  Overloading
		 */
		System.out.println(Max.whatIdo("retrieve"));
		
		
		
		/*
		 *   Hiding
		 */
		System.out.println(Max.description);

		
			
		/*
		 *  The method whatIdo() is undefined for the type Guide.
		 */
		//Buddy.whatIdo();
		
		
		
		/*
		 *   Static type checking OK.
		 */
		Buddy.work();
		
		
			
		/*
		 *   Explicit casting OK.
		 *   Overloading
		 */
		((Labrador)Buddy).whatIdo();
		
				
		/*
		 *   Compilation error: Cannot cast from Cat to Labrador.
		 *   
		 */
		//((Labrador)Molly).whatIdo();
		
	
		
		/*
		 *  Compilation OK as Hunter can be downcast to Lambrador.
		 *  Explicit casting fails as run-time type of Oscar is Cat
		 *  which cannot be cast to Lambrador. An exception is thrown.
		 */
		//((Labrador)Oscar).whatIdo();
		
		
	
		/*
		 *  Compilation fails. No such method in static type of Bella.
		 */
		//Bella.goAfter();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 *  Excplicit casting OK.
		 */
		System.out.println(((Dog)Bella).whatIdo("run in parks"));
		
		
		

		
		
		/*
		 *  Excplicit casting OK.
		 */
		System.out.println("I am " + Rocky.toString() + " and I go after " + ((Labrador)Rocky).goAfter() + ".");
		
		
		

		
		
		
		/*
		 *   Compilation OK.
		 */
		System.out.println(MyCat.toString());
		
		
		

		
		
		/*
		 *   Static type checking OK.
		 *   Overloading.
		 */
		System.out.println("I go after " + Luna.goAfter("cats") + ".");
		
		
	

		
		
		

		
		
		
		/*
		 *  goAfter() undefined for the static type of Roxy
		 */
		//System.out.println(Roxy.goAfter());
		
		
		

		
		
		
		/*
		 *  Method work() undefined for static type of Zeus
		 */
		//Zeus.work();
		
		

		
		
		/*
		 *  Explicit casting OK.
		 */
		((Labrador)Bobby).whatIdo();
		
		
	}

}
