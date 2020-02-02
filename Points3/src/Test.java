
public class Test {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		p1.move(3, 7);
		p1.move(3, 11);
		p2.move(10, 10);
		System.out.println(p1.howMany());
		System.out.println(p2.howMany());

	}

}
