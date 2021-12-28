package logic;

import java.util.ArrayList;
import java.util.List;

public class Travels {

	private List<Travel> travels = new ArrayList<Travel>();

	/**
	 * Default Constructor for Travels
	 */
	public Travels() {
		super();
	}
	
	/**
	 * Add an item to the list
	 */
	public void add(Travel t) {
		travels.add(t);
	}

	/**
	 * @return the travels
	 */
	public List<Travel> getTravels() {
		return travels;
	}

	/**
	 * @param travels the travels to set
	 */
	public void setTravels(List<Travel> travels) {
		this.travels = travels;
	}

}
