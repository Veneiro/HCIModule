package logic;

import java.util.ArrayList;
import java.util.List;

import logic.util.FileUtil;

public class Game {

	private Integer remainingPoints = 0;
	private Integer remainingTrys = 3;
	private String clientLogged = "";
	private List<Gift> redeemedGifts = new ArrayList<Gift>();
	private Clients cli = new Clients();
	private Gifts gf = new Gifts();
	private Travels travels = new Travels();
	
	/**
	 * @param remainingPoints
	 * @param remainingTrys
	 */
	public Game(Integer remainingPoints, Integer remainingTrys) {
		super();
		this.remainingPoints = remainingPoints;
		this.remainingTrys = remainingTrys;
	}
	
	/**
	 * Add a gift to redeemedGiftList
	 */
	public void addRedeemedGift(Gift g) {
		redeemedGifts.add(g);
	}
	
	/**
	 * Remove a gift from redeemedGiftList
	 */
	public void removeRedeemedGift(Gift g) {
		redeemedGifts.remove(g);
	}

	/**
	 * @return the redeemedGifts
	 */
	public List<Gift> getRedeemedGifts() {
		return redeemedGifts;
	}

	/**
	 * @param redeemedGifts the redeemedGifts to set
	 */
	public void setRedeemedGifts(List<Gift> redeemedGifts) {
		this.redeemedGifts = redeemedGifts;
	}

	/**
	 * @return the clientLogged
	 */
	public String getClientLogged() {
		return clientLogged;
	}

	/**
	 * @param clientLogged the clientLogged to set
	 */
	public void setClientLogged(String clientLogged) {
		this.clientLogged = clientLogged;
	}

	/**
	 * @return the remainingPoints
	 */
	public Integer getRemainingPoints() {
		return remainingPoints;
	}

	/**
	 * @param remainingPoints the remainingPoints to set
	 */
	public void setRemainingPoints(Integer remainingPoints) {
		this.remainingPoints = remainingPoints;
	}

	/**
	 * @return the remainingTrys
	 */
	public Integer getRemainingTrys() {
		return remainingTrys;
	}

	/**
	 * @param remainingTrys the remainingTrys to set
	 */
	public void setRemainingTrys(Integer remainingTrys) {
		this.remainingTrys = remainingTrys;
	}
	
	/**
	 * Add Points
	 * @param valueOf
	 */
	public void addPoints(Integer valueOf) {
		setRemainingTrys(getRemainingTrys() - 1);
		if (valueOf == -1) {
			setRemainingPoints(getRemainingPoints() * 2);
		} else if (valueOf == -2) {
			setRemainingTrys(getRemainingTrys() + 1);
		} else {
			setRemainingPoints(getRemainingPoints() + valueOf);
		}
	}
	
	public List<Person> returnClients() {
		return cli.getClients();
	}
	
	public List<Travel> returnTravels(){
		return travels.getTravels();
	}
	
	public void setTravelList(ArrayList<Travel> travelList) {
		travels.setTravels(travelList);
	}
	
	public void addTravelToList(Travel t) {
		travels.add(t);
	}
	
	public List<Gift> returnGifts() {
		return gf.getGifts();
	}
	
	public void removeTravel(Travel t) {
		travels.remove(t);
	}
	
	public void setPlayed() {
		for (Person p : cli.getClients()) {
			if(p.getId_cliente().equals(clientLogged)) {
				p.setCan_play(false);
			}
		}
		FileUtil.updateClientFile(cli.getClients());
	}
}
