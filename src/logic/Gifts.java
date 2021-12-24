package logic;

import java.util.ArrayList;
import java.util.List;

public class Gifts {

	private List<Gift> gifts = new ArrayList<Gift>();

	/**
	 * Default constructor for Gifts class
	 */
	public Gifts() {
		FileUtil.loadFileGifts("resources/files/gifts.dat", gifts);
	}

	/**
	 * @return the gifts
	 */
	public List<Gift> getGifts() {
		return gifts;
	}

	/**
	 * @param gifts the gifts to set
	 */
	public void setGifts(List<Gift> gifts) {
		this.gifts = gifts;
	}
}
