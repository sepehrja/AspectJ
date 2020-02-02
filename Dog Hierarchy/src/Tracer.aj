
public aspect Tracer {

	before(): call(* Dog.*()) {
		System.out.println(">Captured message to object of type Dog: " + thisJoinPoint);
	}
	
	before(): call(* Collie.*()) {
		System.out.println(">Captured message to object of type Collie: " + thisJoinPoint);
	}
	
	after() : execution(* Dog.*()) {
		System.out.println(">Captured execution in class Dog: " + thisJoinPoint);
	}
	after() : execution(* Collie.*()) {
		System.out.println(">Captured execution in class Collie: " + thisJoinPoint);
	}

}
