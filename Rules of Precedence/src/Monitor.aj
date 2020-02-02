
public aspect Monitor {
  
	/*
	pointcut progmonitor(): execution (public static void *.main(..));	


  before(): progmonitor() {
	    System.out.println(">before; defined first; should have precedence.");
	  }
 
  before(): progmonitor() {
	    System.out.println(">before; defined last.");
	  }
  
  after(): progmonitor() {
    System.out.println(">after; defined first.");
  }
   

  after(): progmonitor() {
    System.out.println(">after; defined last; should have precedence.");
  }
*/
	
	
	
/*
pointcut progmonitor(): execution (public static void *.greet());


void around(): progmonitor() {
	System.out.println(">around; defined first; should have precedence.");
	proceed();
  }

void around(): progmonitor() {
	System.out.println(">around.");
	proceed();
  }

	*/
	
	
	
	
	
	
	
/*
	pointcut progmonitor(): execution (public static void *.main(..));
   
	before(): progmonitor() {
	    System.out.println(">before.");
	  } 
	  after(): progmonitor() {
	    System.out.println(">after.");
	  }

 */
	
	
	
}