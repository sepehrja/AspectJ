
public aspect Tracer {

	/*
	
	before(): call(* java.util.List.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}

	before(): call(* java.util.Collection.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}

	before(): call(* java.util.ArrayList.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}


	before(): call(* java.util.List+.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}	
	
	before(): call(* java.util.*List.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}
	
	before(): call(* java.util.Set.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}

	before(): call(* java.util.*.*(..)) {
		System.out.println("Before " + thisJoinPoint);
	}

	
	before(): call(* java.util.*.*(..)) {
		System.out.println("Before " + thisJoinPoint);
	}
	

	after(): call(* java.util.*.*(..)) {
		System.out.println("After " + thisJoinPoint);
	}
	
	before(): call(* *.*(..)) {
		System.out.println("Captured " + thisJoinPoint);
	}

	private int numOfObjs;
	
	after(): call(java.util.*.new(..)) {
		System.out.println(thisJoinPoint + " Total objects: " + ++numOfObjs);
	}
	
	private int numOfAdds;
	
	after(): call(* java.util.*.add(..)) {
		numOfAdds++;
	}
	
	after(): execution (public static void *.main(..)) {
		System.out.println("Number of add(..) messages: " + numOfAdds);
	}

	*/
}
