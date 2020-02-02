
public class Test {

	public static void main(String[] args) {		
		
		Cat Kitty=new Cat();
		/*
		 *   Compilation is successful as the type of the expression on
		 *      the RHS is the same as the type of the variable on
		 *      the LHS.
		 */
		
		
		System.out.println("Cat Kitty 's action is "+ Kitty.getAction());
		/*
		 *  Compiler: Responsible for validating method invocation.
		 *     Compilation is successful, since there exists a method
		 *     getAction() in the static type of Kitty, namely Cat.
		 *  
		 *  Run-time system: Responsible for choosing method invocation.
		 *     Run-time system will start a lookup from the run-time
		 *     type of Kittie, namely Cat. it will successfully locate
		 *     and invoke the getAction() method defined in class Cat,
		 *     displaying "Cat Kitty 's action is eating"
		 */
		
		
		
		Animal a = new Animal();
		/*
		 *   Compilation is successful as the type of the expression on
		 *      the RHS is the same as the type of the variable on
		 *      the LHS.
		 */
		
		
		//Cat c = (Cat) a;
		
		/*
		 *   Compilation is successful as the type of the expression on
		 *      the RHS (Cat) is the same as the type of the variable on
		 *      the LHS. This has been done through narrowing (or
		 *      "down casting").
		 *   
		 *   Run-time system: Responsible to validate casting. This will
		 *      fail since the run-time type of object a is Animal.
		 *      
		 *   The assignment statement is thus commented out to allow program
		 *   compilation to proceed.
		 */
		
		
		
		//System.out.println("Cat c 's action is "+ c.getAction());
		/*
		 *  This is also commented out for the reasons given above.
		 */

		
		
		//System.out.println("Cat a 's action is "+ a.getAction());
		
		/*
		 *  Compiler: Responsible for validating method invocation.
		 *     Compilation is not successful, since there not exist a method
		 *     getAction() in the static type of a, namely Animal.
		 *      
		 *   The statement is thus commented out to allow program
		 *   compilation to proceed.
		 */
		
		
		
		Animal b = new Cat();
		/*
		 *   Compilation is successful as the type of the expression on
		 *      the RHS (Cat) is a subtype to the type of the variable on the
		 *      LHS (Animal).
		 */
		
		
		
		
		Cat d = (Cat)b;
		/*
		 *   Compilation is successful as the type of the expression on
		 *      the RHS (Cat) is the same as the type of the variable on the
		 *      LHS. This has been done through narrowing (or "down casting").
		 *   
		 *   Run-time system: Responsible to validate casting. This will
		 *      succeed since the run-time type of object b is Cat.
		 */
		
		
		//System.out.println("Cat b 's action is "+ b.getAction());
		/*
		 *  Compiler: Responsible for validating method invocation.
		 *     Compilation is not successful, since there does not exist
		 *     a method getAction() in the static type of b, namely Animal.
		 *           
		 *   The statement is thus commented out to allow program
		 *   compilation to proceed.    
		 */
		
		
		System.out.println("Cat d 's action is "+ d.getAction());
		/*
		 *  Compiler: Responsible for validating method invocation.
		 *     Compilation is successful, since there exists a method
		 *     getAction() in the static type of d, namely Cat.
		 *  
		 *  Run-time system: Responsible for choosing method invocation.
		 *     Run-time system will start a lookup from the run-time
		 *     type of d, namely Cat. It will successfully locate
		 *     and invoke the getAction() method defined in class Cat,
		 *     displaying "Cat d 's action is eating"
		 */

	}

}
