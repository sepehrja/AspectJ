/*
 *  C. Constantinides, 2013.
 */
public aspect Logger {

  int Point.numberOfMoves;
  public int Point.howMany() {
	  return this.numberOfMoves;
  }
  
  pointcut counts(Point p) : execution(void Point.move(double, double)) && 
                             this(p);
  
  after(Point p) : counts(p) {
    p.numberOfMoves++;
  }
  
}