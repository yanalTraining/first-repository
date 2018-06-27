
public class FootBall extends Team implements Comparable<FootBall> {
	static int teamNum = 0;
	int trainingType=270;
	int date=2;
	int teamplayer=24;
	int playerRate=2;
	private String[][] tTable = new String[trainingType][date];// Training table
	private String[][] teamPlayerName = new String[teamplayer][playerRate];// name and rat for
															// player

	public FootBall(String type, int teamId, String mangerName) {
		super(type, teamId, mangerName);
		teamNum++;
		// TODO Auto-generated constructor stub
	}

	public String[][] gettTable() {
		return tTable;
	}

	public void settTable(String[][] tTable) {
		this.tTable = tTable;
	}

	public String[][] getTeamPlayerName() {
		return teamPlayerName;
	}

	public void setTeamName(String[][] teamName) {
		this.teamPlayerName = teamName;
	}

	public String compare(FootBall f) {
		// TODO Auto-generated method stub
		int rat1 = 0;// team for this object
		int rat2 = 0;// team for gust object
		String[][] team2 = f.getTeamPlayerName();
		for (int i = 0; i < teamPlayerName.length; i++) {
			rat1 += Integer.parseInt(teamPlayerName[i][1]);
			rat2 += Integer.parseInt(team2[i][1]);

		}

		if (rat1 > rat2) {
			return getTeamName();
		} else if (rat1 < rat2) {
			return f.getTeamName();
		} else {
			return getTeamName() + "===" + f.getTeamName();
		}
	}

	@Override
	public int compareTo(FootBall f) {
		// TODO Auto-generated method stub
		int rat1 = 0;// team for this object
		int rat2 = 0;// team for gust object
		String[][] team2 = f.getTeamPlayerName();
		for (int i = 0; i < teamPlayerName.length; i++) {
			rat1 += Integer.parseInt(teamPlayerName[i][1]);
			rat2 += Integer.parseInt(team2[i][1]);

		}
		if (rat1 > rat2) {
			return 1;
		} else if (rat1 < rat2) {
			return -1;
		} else {
			return 0;
		}
	}

	public void print() {
		System.out.println("Manegr Name: " + getMangerName());
		System.out.println("Team name: ");
		System.out.println("**********************************");
		for (int i = 0; i < tTable.length; i++) {
			System.out.println("training type " + tTable[i][0] + "     training date " + tTable[i][1]);
		}
	}

}
