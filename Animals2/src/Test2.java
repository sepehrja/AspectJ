
public class Test2 {
	public static void main(String[] args) {


		Dog Max = new Labrador("Max");
		//Labrador Duke = new Animal("Duke");
		Guide Buddy = new Labrador("Buddy");
		Cat Molly = new Cat("Molly");
		Hunter Oscar = new Cat("Oscar");
		Hunter Bella = new Dog("Bella");
		Hunter Rocky = new Labrador("Rocky");
		Hunter MyCat = new Cat();
		Labrador Luna = new Labrador("Luna");
		Guide Roxy = new Labrador("Roxy");
		Hunter Zeus = new Labrador("Zeus");
		Animal Bobby = new Labrador("Bobby");
		//Guide Honey = new Dog("Honey");
		System.out.println(Max.lifeSpan);
		Max.describe();
		System.out.println(Max.whatIdo("retrieve"));
		System.out.println(Max.description);
		//Buddy.whatIdo();
		Buddy.work();
		((Labrador)Buddy).whatIdo();
		//((Labrador)Molly).whatIdo();
		//((Labrador)Oscar).whatIdo();
		//Bella.goAfter();
		System.out.println(((Dog)Bella).whatIdo("run in parks"));
		System.out.println("I am " + Rocky.toString() + " and I go after " + ((Labrador)Rocky).goAfter() + ".");
		System.out.println(MyCat.toString());
		System.out.println("I go after " + Luna.goAfter("cats") + ".");
		//System.out.println(Roxy.goAfter());
		//Zeus.work();
		((Labrador)Bobby).whatIdo();
		
	}

}
