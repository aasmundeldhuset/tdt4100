package soccer;

import java.util.ArrayList;
import java.util.Arrays;

public class LeagueTable {
	private LeagueTableRow[] rows;
	private ArrayList<MatchResult> results;
	
	public LeagueTable(String[] teams) {
		this.rows = new LeagueTableRow[teams.length];
		for (int i = 0; i < teams.length; i++) {
			this.rows[i] = new LeagueTableRow(teams[i]);
		}
		this.results = new ArrayList<MatchResult>();
	}
	
	public int getParticipantPoints(MatchResult matchResult, String participant) {
		if (matchResult.isWinner(participant))
			return 3;
		else if (matchResult.isDraw() && matchResult.isParticipant(participant))
			return 1;
		else
			return 0;
	}
	
	private void addTeamResult(MatchResult result, String team) {
		int points = getParticipantPoints(result, team);
		for (int i = 0; i < rows.length; i++) {
			if (rows[i].getTeam().equals(team)) {
				rows[i].addPoints(points);
				break;
			}
		}
	}
	
	public void addResult(MatchResult result) {
		results.add(result);
		addTeamResult(result, result.getHomeTeam());
		addTeamResult(result, result.getVisitingTeam());
		Arrays.sort(rows);	// This works as long as the class of the objects being sorted (LeagueTableRow) implements Comparable.
							// If it does not, you must use a comparator instead: Arrays.sort(rows, new LeagueTableRowComparator()); .
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < rows.length; i++) {
			result += rows[i].getTeam() + "\t" + rows[i].getPoints() + "\n";
		}
		return result;
	}
	
	// It is possible to not have a separate comparator class, but to use LeagueTable instead. 
	// Then, LeagueTable must implement Comparator<LeagueTableRow> with the below method,
	// and line 43 of this file must be Arrays.sort(rows, this); .
	// public int compare(LeagueTableRow a, LeagueTableRow b) {
	//	return a.getTeam().compareTo(b.getTeam());
	// }
}
