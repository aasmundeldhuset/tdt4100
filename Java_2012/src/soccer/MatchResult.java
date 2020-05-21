package soccer;

public class MatchResult {
	private String homeTeam;
	private String visitingTeam;
	private int homeGoals;
	private int visitingGoals;
	
	public MatchResult(String homeTeam, String visitingTeam) {
		this.homeTeam = homeTeam;
		this.visitingTeam = visitingTeam;
		this.homeGoals = 0;
		this.visitingGoals = 0;
	}
	
	public boolean isParticipant(String participant) {
		return participant.equals(homeTeam) || participant.equals(visitingTeam);
	}
	
	public boolean isDraw() {
		return homeGoals == visitingGoals;
	}
	
	public boolean isWinner(String participant) {
		if (participant.equals(homeTeam) && homeGoals > visitingGoals)
			return true;
		else if (participant.equals(visitingTeam) && visitingGoals > homeGoals)
			return true;
		else
			return false;
	}
	
	public int getHomeGoals() {
		return homeGoals;
	}
	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}
	public int getVisitingGoals() {
		return visitingGoals;
	}
	public void setVisitingGoals(int visitingGoals) {
		this.visitingGoals = visitingGoals;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public String getVisitingTeam() {
		return visitingTeam;
	}
}
