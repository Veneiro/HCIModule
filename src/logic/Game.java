package logic;

public class Game {

	private Integer remainingPoints = 0;
	private Integer remainingTrys = 3;
	
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
}
