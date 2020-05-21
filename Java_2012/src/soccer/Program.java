package soccer;

public class Program {
	public static void main(String[] args) {
		String[] teams = {"Start", "RBK", "Brann", "Viking", "Molde"};
		LeagueTable table = new LeagueTable(teams);
		MatchResult result = new MatchResult("RBK", "Start");
		result.setHomeGoals(4);
		result.setVisitingGoals(2);
		table.addResult(result);
		
		result = new MatchResult("RBK", "Molde");
		result.setHomeGoals(1);
		result.setVisitingGoals(1);
		table.addResult(result);
		
		System.out.println(table);
	}
}
