public aspect StackProtocolEnforcer {

	pointcut allowedcalls() : 
		call(* java.util.Stack.push(..)) ||
		call(* java.util.Stack.pop()) ||
		call(* java.util.Stack.empty()) ||
		call(* java.util.Stack.peek()); 

	Object around(): (call(* java.util.Stack.*(..)) || call(* java.util.Stack.*())) && !allowedcalls() {
		System.out.println(thisJoinPoint + " is not allowed for a Stack ADT.");
		return thisJoinPoint + ": Illegal operation.";
	}
		
}