package soccer;

public class LeagueTableRow implements Comparable<LeagueTableRow> {
	//http://folk.ntnu.no/asmunde/tdt4100-2012/
	private String team;
	private int points;
	
	public LeagueTableRow(String team) {
		this.team = team;
		this.points = 0;
	}
	
	// Collections.sort(list);
	// Arrays.sort(array);
	
	public int compareTo(LeagueTableRow other) {
		if (this.points > other.points)
			return -1;
		else if (this.points < other.points)
			return 1;
		else
			return 0;
	}

	public int getPoints() {
		return points;
	}

	public void addPoints(int points) {
		this.points += points;
	}

	public String getTeam() {
		return team;
	}
}
