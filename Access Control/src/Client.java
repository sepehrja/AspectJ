
public class Client {

	private String name;
	private Server server;
	private Boolean authenticated;

	public Client(String name, Server server) {
		this.name = name;
		this.server = server;
		this.authenticated = false;
	}
	
	public void authenticate() {
		authenticated = true;
	}
	
	public void connect() {
		server.establishConnection(this);
	}
	
	public String toString() {
		return name;
	}

}
