package soccer;

import java.util.Comparator;

public class LeagueTableRowPointComparator implements Comparator<LeagueTableRow> {
	public int compare(LeagueTableRow a, LeagueTableRow b) {
		if (a.getPoints() > b.getPoints())
			return -1;
		else if (a.getPoints() < b.getPoints())
			return 1;
		else
			return 0;
	}
}
