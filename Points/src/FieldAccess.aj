public aspect FieldAccess {

	/*
  	before() : get(* ColoredPoint.*) {
    	System.out.println(">Read access: " + thisJoinPoint);
  	}
  	before() : set(* ColoredPoint.*) {
    	System.out.println(">Write access: " + thisJoinPoint);
  	}
	 */
 

  before() : get(* Point+.*) {
	  System.out.println(">Read access: " + thisJoinPoint);
  }
  before() : set(* Point+.*) {
	  System.out.println(">Write access: " + thisJoinPoint);
  }

}

