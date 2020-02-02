
public aspect Tracer {

	
	public static int Point.numberOfInstances;
	
	public static int Point.howMany() {
		return numberOfInstances;
	}
	
	after (): execution (Point.new(..)) {
		Point.numberOfInstances++;
	}
	
	
}
