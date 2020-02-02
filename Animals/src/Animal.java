
public class Animal {
	private String name;
	
	public Animal() {
		name = "No name";
	}
	
	public Animal( String theName) {
		if(name == null ){
			System.out.println("Fatal Error creating Animal");
			System.exit(0);
		}
		name=theName;
	}
	
	public Animal(Animal AnimalObject) {
		name=AnimalObject.name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		if(newName == null)
		{
			System.out.println("Fatal Error setting name.");
			System.exit(0);
		}
		else
			name = newName;
	}
	
	public String toString() {
		return(name +""+ name.toString());
	}
	
	public boolean equals (Animal otherAnimal){
		return(name.equals(otherAnimal.name));
	}
	
}
