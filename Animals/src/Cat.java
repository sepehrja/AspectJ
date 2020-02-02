public class Cat extends Animal {
	private String action;
	
	public Cat() {
		super();
		action="eating";
	}
	
	public Cat(String theName, String theAction) {
		super(theName);
		if(theAction==null){
			action=theAction;
		}
		else{
			System.out.println("Fatal Error: creating an illegal cat");
			System.exit(0);
		}
	}
	
	public Cat(Cat originalObject) {
		super(originalObject);
		action=originalObject.action;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String CatAction) {
		if(action==null){
			action=CatAction;}
		else{
			System.out.println("Fatal Error: creating an illegal cat");
			System.exit(0);
		}
	}
	
	public String toString(){
		return("Cat " +getName()+" is "+getAction()+".");
	}
	
	public boolean equals(Cat other) {
		return(getName().equals(other.getName()))&&getAction().equals(other.getAction());
	}
}
