// C. Constantinides, 2009.

public class Test {
	public static void main(String args[]) {
		C1 obj1 = new C1();
		C2 obj2 = new C2();
		C2 obj3 = new C3();
		MyIF obj4 = new C3();
		
		obj1.call(0);
		obj2.call(1);
		obj3.call(2); 
		//obj4.call(3); 
		obj4.callback();
		((C2)obj4).call(4);
		((C2)obj1).callback(); 
	}	
}

