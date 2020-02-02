
public aspect Logger {
	
	pointcut accessLog (Server server, Client client):
		call(* Server.establishConnection(Client)) && 
		this(client) && 
		target(server);

	before(Server server, Client client): accessLog (server, client) {
	  System.out.println("Connection established between " + client.toString() + " and " + server.toString() + ".");
  }

  
}
