
public class Test {


	public static void main(String[] args) {
		Server server = new Server();
		Client client = new Client(server);
		System.out.println(client.testConnection());		

	}

}
