
public privileged aspect AccessController {
	
	declare precedence: AccessController, Logger;

	pointcut accessMonitor (Server server, Client client):
					call(* Server.establishConnection(Client)) && 
					this(client) && 
					target(server);

	void around (Server server, Client client): accessMonitor (server, client) {
		if (client.authenticated)
			proceed(server, client);
		else
			System.out.println("Authentication error: " + client.toString() + " cannot establish a connection " + "to " + server.toString() + ".");
	}
}
