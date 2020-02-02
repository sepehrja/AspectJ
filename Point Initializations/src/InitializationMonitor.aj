
public aspect InitializationMonitor {

	after() : initialization(ColoredPoint.new(..)) {
		System.out.println(thisJoinPoint);
	}
	
	
	
	

}
