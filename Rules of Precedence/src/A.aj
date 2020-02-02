
public aspect A {
  declare precedence: A, B;
  pointcut callMain() : execution (public static void *.main(..));
  
  //before(): callMain() {System.out.println(">A: before.");}
  //after(): callMain() {System.out.println(">A: after.");}
  
  void around(): callMain() {
	  System.out.println(">A: around.");
	  //proceed();
	  }
}