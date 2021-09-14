/*
 * Ares Ton-That
 * This program is designed to allow users to create a MonsterAttack object.
 */

public class MonsterAttack {

	// Create data fields.
	private int attackID;
	private int dayOfTheMonth;
	private int month;
	private int year;
	private String nameOfMonster;
	private String locationOfAttack;
	private String nameOfReporter;

	// Create a constructor for MonsterAttack.
	public MonsterAttack(int attackID, String date, String nameOfMonster, String locationOfAttack,
			String nameOfReporter) {

		this.attackID = attackID;

		String[] dateSplitted = new String[3];

		dateSplitted = date.split("/");

		this.month = Integer.parseInt(dateSplitted[0]);
		this.dayOfTheMonth = Integer.parseInt(dateSplitted[1]);
		this.year = Integer.parseInt(dateSplitted[2]);
		this.nameOfMonster = nameOfMonster;
		this.locationOfAttack = locationOfAttack;
		this.nameOfReporter = nameOfReporter;
	}

	// Create getter and setter methods for the data fields.
	public int getAttackID() {
		return attackID;
	}

	public void setAttackID(int attackID) {
		this.attackID = attackID;
	}

	public int getDayOfTheMonth() {
		return dayOfTheMonth;
	}

	public void setDayOfTheMonth(int dayOfTheMonth) {
		this.dayOfTheMonth = dayOfTheMonth;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNameOfMonster() {
		return nameOfMonster;
	}

	public void setNameOfMonster(String nameOfMonster) {
		this.nameOfMonster = nameOfMonster;
	}

	public String getLocationOfAttack() {
		return locationOfAttack;
	}

	public void setLocationOfAttack(String locationOfAttack) {
		this.locationOfAttack = locationOfAttack;
	}

	public String getNameOfReporter() {
		return nameOfReporter;
	}

	public void setNameOfReporter(String nameOfReporter) {
		this.nameOfReporter = nameOfReporter;
	}

	// Create a toString method for a MonsterAttack.
	public String toString() {

		return "\"Attack # " + attackID + ": " + nameOfMonster + " attacked " + locationOfAttack + " on " + month + "/"
				+ dayOfTheMonth + "/" + year + ". Reported by " + nameOfReporter + ". \"";
	}

}