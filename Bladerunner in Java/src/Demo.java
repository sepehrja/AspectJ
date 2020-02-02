// C. Constantinides, 2012.

public class Demo {



	public static void main(String[] args) {

		//PART I: Compile and run
		
		Machine Leon = new Android(7);	// Type checking OK: Static type of expression on RHS is a subtype of static type of variable on LHS.
		
		//System.out.println(Leon.whatIneed()); // Static features are accessed based on the declared (static) type of the object (Machine).
											// Method whatIneed does not exist in declared type (Machine) => compilation error.
		
		
		Android Roy = new Android2(7);	// Type checking OK: Static type of expression on RHS is a subtype as the static type of variable on LHS.
		
		System.out.println(((Android2)Roy).whatIhave());
		
											// Compilation successful: Static type of Roy (Android) is a supertype of Android2
		
											// Run-time will
											// a) check the validity of explicit cast: Successful since the run-time type of Roy
											// (Android2) is the same or a subtype of Android2.
											// b) Invoke the dynamic dispatcher to call method whatIhave() defined in the run-time type
											// of the object, namely Android2. Displays "I have an infinite time."
		
		
		Behavior2 Pris = new Android2(11);// Type checking OK: Static type of expression on RHS is a subtype as the static type of variable on LHS.
		
		//System.out.println(Pris.whatIhave()); // Method whatIhave() does not exist in declared type (Behavior) => compilation error.
		
		//Android2 Zohra = new Android();     // Static type checking fails: Static type of expression on RHS is not a subtype as the static type of variable on LHS.
		
		Behavior2 Hodge = new Android2();// Type checking OK: Static type of expression on RHS is a subtype as the static type of variable on LHS.
		
		//System.out.println(Hodge.whatIhave()); // method whatIhave() does not exist in declared type of Hodge (Behavior2) => Compilation error.
		
		Android Rachel = new Android(7);// Type checking OK: Static type of expression on RHS is the same as the static type of variable on LHS.
		
		System.out.println(((Android2)Rachel).hasMemories());
									// Will compile but explicit cast will not be verified
		
		
		Human Gaff = new Bladerunner();// Type checking OK: Static type of expression on RHS is a subtype of static type of variable on LHS.
		
		System.out.println(Gaff.type); // Variables are accessed based on the declared (static) type of the object (Human).
											// Displays HUMAN.
		
		System.out.println("Gaff has empathy?: " + Gaff.hasEmpathy()); // Static type checking OK. Method hasEmpathy(void) exists in declared type
																	// or one of its supertypes (Human).
		
																	// Run-time system invokes dynamic dispatcher and starts search from 
																	// Bladerunner: Method not found. Dispatcher continues search in superclass: Found.
																	// Returns true.
		
		System.out.println(Gaff.reason()); 	// Static type checking OK. Method reason(void) exists in declared type (Bladerunner).
		
											// Run-time system invokes dynamic dispatcher and starts search from 
											// Bladerunner: Method found.
		
		Bladerunner Harry = new Bladerunner("CHIEF.");// Type checking OK: Static type of expression on RHS is the same as the static type of variable on LHS.
													// Constructor displays local variable (OFFICER) because of shadowing.
		
		
		//PART II: Extend
		
		// Provide the definition of Bladerunner2 who is an Android2 but also behaves exactly like a Bladerunner.
		// Can be instantiated as follows:
		Bladerunner2 Deckard = new Bladerunner2();
		
		// What is the output of the code below and why?
		System.out.println(Deckard.reason());
		
		// Verify whether Deckard is human. Should display MACHINE.
		System.out.println(Deckard.type);
		
		// Identify a pair of overloaded features
		// Overriding features
		// Shadowed features
		// Hidden features
		
		
	}

}
