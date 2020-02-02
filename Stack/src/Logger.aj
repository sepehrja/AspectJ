
public aspect Logger {

	pointcut mutators(): call(void BStack.push(String)) || call(String BStack.pop());
	
	before(): mutators() {
		System.out.println(">Message sent to update stack.");
		//System.out.println(">Message sent to update stack: " + thisJoinPoint);
	}
}
