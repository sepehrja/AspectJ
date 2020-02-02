
public aspect ReflectiveLogger {
	after(): execution(* *(..))
		&& !within(ReflectiveLogger)
		&& !cflow(execution (* java.*.*.*(..))) {
		    System.out.println(">Executed: " + thisJoinPoint);
	}
}
