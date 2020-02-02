import java.util.ArrayList;

public class Server {
	
	private String name;
	private ArrayList<Client> clients = new ArrayList<Client>();
		
	public Server(String name) {
		this.name = name;
	}
	
	public void establishConnection (Client client) {
		clients.add(client);
	}

	public void breakConnection (Client client) {
		clients.remove(client);
	}
	
	public String toString() {
		return name;
	}

}
