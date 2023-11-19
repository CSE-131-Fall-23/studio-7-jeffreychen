package studio7;

public class HockeyPlayer {
	private String name;
	private String number;
	private boolean rightShoot;
	private boolean leftShoot;
	private boolean shootingHand; //Default left-handed
	private int goals;
	private int assists;
	private int totalGoals;
	private int totalAssists;
	private int points;
	private int gamesPlayed;
	//Without methods to display user information

	public HockeyPlayer(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public void rightShootStatus(String userInput) {
		if (userInput.equals("Yes")) {
			this.rightShoot= true;
		}
	}
	
	public void leftShootStatus(String userInput) {
		if (userInput.equals("Yes")) {
			this.leftShoot= true;
		}
	}
	
	public void setHand(String userInput) {
		if (userInput.equals("Right")) {
			this.shootingHand = true;
		}
		else if (userInput.equals("Left")) {
			this.shootingHand = false;
		}
	}

	@Override
	public String toString() {
		return "HockeyPlayer [name=" + name + ", number=" + number + "]";
	}

	public void completeGame(int goals, int assists) {
		this.goals = goals;
		this.assists = assists;

		this.totalGoals += goals;
		this.totalAssists += assists;
		this.points += (goals + assists);
		this.gamesPlayed++;
	}

}
