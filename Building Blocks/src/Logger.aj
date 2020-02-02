
public aspect Logger {
		  private int numOfPushCalls;
		
		
		  before(): call(void BStack.push(String)) {
		    System.out.println("[Request] " + thisJoinPoint);
		  }
		  after(): call(void BStack.push(String)) {
		    System.out.println("[Completed] " + thisJoinPoint +
		                       "\nNumber of completed push calls: " +
		                       ++numOfPushCalls + "\n");
		  }
		  
		  before(): execution(void BStack.push(String)) {
			    System.out.println("  [About to execute] " + thisJoinPoint);
			  }
			  after(): execution(void BStack.push(String)) {
			    System.out.println("  [Executed] " + thisJoinPoint);
			  }
		  
	/*
		
		  		  before(): call(void Stack.push(String)) {
		    System.out.println("[Request] " + thisJoinPoint);
		  }
		  after(): call(void Stack.push(String)) {
		    System.out.println("[Completed] " + thisJoinPoint +
		                       "\nNumber of completed push calls: " +
		                       ++numOfPushCalls + "\n");
		  }
		  before(): execution(void Stack.push(String)) {
		    System.out.println("  [About to execute] " + thisJoinPoint);
		  }
		  after(): execution(void Stack.push(String)) {
		    System.out.println("  [Executed] " + thisJoinPoint);
		  }
		*/ 
}