
public class Test {

	public static void main(String[] args) {

		Server server = new Server("Concordia University");
		
		Client c1 = new Client("Jack", server);
		Client c2 = new Client("Jill", server);
		
		c1.authenticate();
		c1.connect();
		c2.connect();

	}

}
