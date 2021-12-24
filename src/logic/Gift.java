package logic;

public class Gift {

	private String code;
	private String section;
	private String name;
	private String description;
	private Integer points;
	
	/**
	 * @param code
	 * @param section
	 * @param name
	 * @param description
	 * @param points
	 */
	public Gift(String code, String section, String name, String description,
			Integer points) {
		super();
		this.code = code;
		this.section = section;
		this.name = name;
		this.description = description;
		this.points = points;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the points
	 */
	public Integer getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(Integer points) {
		this.points = points;
	}
	
	public String toString() {
		return getName() + " - " + getPoints();
	}
}
