
public aspect HistoryProtocol {
  private boolean afterGet;
  
  after(): execution(void Buffer.put(String)) ||
  			execution(String Buffer.gget()) {
	  afterGet = false;
  }
  
  after(): execution(String Buffer.get()) {
    afterGet = true;
  }
  
  String around() : call (String Buffer2.gget()) {
    if (afterGet == false)
      return "Error: Cannot execute gget()";
    else
    	return proceed();
  }
}
