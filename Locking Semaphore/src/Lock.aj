
public privileged aspect Lock {
	declare parents: Semaphore implements Lockable;

	private boolean Semaphore.lock;
	
	  public void Semaphore.lock() {
	    this.lock = true;
	  }
	  
	  public void Semaphore.unlock() {
	    this.lock = false;
	  }
	  
	  public boolean Semaphore.isLocked() {
	    return this.lock;
	  }
	  
	 pointcut monitoringMods (Semaphore s): (call (* Semaphore.increment()) ||
			 								call (* Semaphore.decrement())) &&
			 								target(s);
		
	  void around (Semaphore s): monitoringMods(s) {
		  if (s.isLocked() == true)
		      System.out.println("Error: Cannot set semaphore value.");
		    else
		    	proceed(s);
	  }
	  
}
