

public aspect Logger {
	
	before() : call(String Server.ping()) {
		System.out.println(">Before: " + thisJoinPoint);
	}
 
	after() : call(String Server.ping()) {
		System.out.println(">After: " + thisJoinPoint);
	}
	
	before() : execution(String Server.ping()) {
		System.out.println(">Before: " + thisJoinPoint);
	}
 
	after() : execution(String Server.ping()) {
		System.out.println(">After: " + thisJoinPoint);
	}
  
}
