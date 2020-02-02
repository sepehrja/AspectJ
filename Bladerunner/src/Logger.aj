
public aspect Logger {
  
	/*
before() : call(String Human.reason()) {
    System.out.println(">Captured call to Human.reason(): " + thisJoinPoint);
  }
  
 before() : call(String Bladerunner.reason()) {
    System.out.println(">Captured call to Bladerunner.reason(): " + thisJoinPoint);
  }
  */
	

	before() : execution(String Human.reason()) {
	    System.out.println(">Captured execution of Human.reason(): " + thisJoinPoint);
	  }
	  
	 before() : execution(String Bladerunner.reason()) {
	    System.out.println(">Captured execution of Bladerunner.reason(): " + thisJoinPoint);
	  }
  

  
}
