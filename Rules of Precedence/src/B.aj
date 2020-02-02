
public aspect B {
  pointcut callMain() : execution(public static void *.main(..));
  //before(): callMain() {System.out.println(">B: before.");}
  //after(): callMain() {System.out.println(">B: after.");}
  
  void around(): callMain() {
	  System.out.println(">B: around.");
	//proceed();  
  }
}