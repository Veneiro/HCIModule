package logic;

public class Travel {

	private String description;
	private String travelCode;
	private int day;
	private int month;
	private int year;
	private String observations;
	private boolean dateAssigned = false;

	/**
	 * @param description
	 * @param day
	 * @param month
	 * @param year
	 */
	public Travel(String description, String travelCode, int day, int month,
			int year, String observations) {
		super();
		this.description = description;
		this.travelCode = travelCode;
		this.day = day;
		this.month = month;
		this.year = year;
		this.observations = observations;
	}

	/**
	 * @return the travelCode
	 */
	public String getTravelCode() {
		return travelCode;
	}

	/**
	 * @param travelCode the travelCode to set
	 */
	public void setTravelCode(String travelCode) {
		this.travelCode = travelCode;
	}

	/**
	 * @return the dateAssigned
	 */
	public boolean isDateAssigned() {
		return dateAssigned;
	}

	/**
	 * @param dateAssigned the dateAssigned to set
	 */
	public void setDateAssigned(boolean dateAssigned) {
		this.dateAssigned = dateAssigned;
	}

	/**
	 * @return the observations
	 */
	public String getObservations() {
		return observations;
	}

	/**
	 * @param observations the observations to set
	 */
	public void setObservations(String observations) {
		this.observations = observations;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return description;
	}

	public String toStringComplete() {
		return getTravelCode() + "@" + day + "/" + month + "/" + year + "@"
				+ observations;
	}
}
