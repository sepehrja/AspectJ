public aspect Behavior {

	declare parents: Noble implements Allegiance;

	public void Noble.declare() {
		System.out.println(this.toString() + " Of House " + this.house + "."); 
	}
  
	public void Noble.speak() {
		System.out.println("Good morning my lord. " + this.toString());
	}
  
}
