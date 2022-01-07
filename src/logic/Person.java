package logic;

public class Person {

	private String id_cliente;
	private String Name_Surname;
	private boolean can_play;

	/**
	 * @param id_cliente
	 * @param name_Surname
	 * @param can_play
	 */
	public Person(String id_cliente, String name_Surname, boolean can_play) {
		super();
		this.id_cliente = id_cliente;
		Name_Surname = name_Surname;
		this.can_play = can_play;
	}

	/**
	 * @return the id_cliente
	 */
	public String getId_cliente() {
		return id_cliente;
	}

	/**
	 * @param id_cliente the id_cliente to set
	 */
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}

	/**
	 * @return the name_Surname
	 */
	public String getName_Surname() {
		return Name_Surname;
	}

	/**
	 * @param name_Surname the name_Surname to set
	 */
	public void setName_Surname(String name_Surname) {
		Name_Surname = name_Surname;
	}

	/**
	 * @return the can_play
	 */
	public boolean isCan_play() {
		return can_play;
	}

	/**
	 * @param can_play the can_play to set
	 */
	public void setCan_play(boolean can_play) {
		this.can_play = can_play;
	}

	@Override
	public String toString() {
		return id_cliente + "@"
				+ Name_Surname + "@" + toCanPlay();
	}

	private String toCanPlay() {
		if(isCan_play()) {
			return "1";
		} else {
			return "0";
		}
	}

}
