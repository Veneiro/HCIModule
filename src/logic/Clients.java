package logic;

import java.util.ArrayList;
import java.util.List;

import logic.util.FileUtil;

public class Clients {

	private List<Person> clients = new ArrayList<Person>();
	
	
	/**
	 * @param clients
	 */
	public Clients() {
		FileUtil.loadFileClients("resources/files/clients.dat", clients);
	}

	/**
	 * @return the clients
	 */
	public List<Person> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<Person> clients) {
		this.clients = clients;
	}
}
