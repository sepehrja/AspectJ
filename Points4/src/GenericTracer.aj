
public privileged abstract aspect GenericTracer<T> {

	pointcut trace(T t): execution(* T.*(..)) && this(t);
	
	after(T t): trace(t) {
		System.out.println(thisJoinPoint);
	}

	
}
