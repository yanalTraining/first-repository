
public class Basketball extends Team implements Comparable<Basketball> {
	static int teamNum = 0;
	int numOfSession = 4;
	int dateForSession = 2;
	int playerNum = 24;
	int playerRate = 2;

	private String[][] trainingTable = new String[numOfSession][dateForSession];// Training
																				// table
	private String[][] teamPlayerName = new String[playerNum][playerRate];

	public Basketball(String teamType, int teamId, String mangerName) {
		super(teamType, teamId, mangerName);
		teamNum++;
		// TODO Auto-generated constructor stub
	}

	public String[][] gettTable() {
		return trainingTable;
	}

	public void settTable(String[][] tTable) {
		this.trainingTable = tTable;
	}

	public String[][] getteamPlayerName() {
		return teamPlayerName;
	}

	public void setTeamName(String[][] teamName) {
		this.teamPlayerName = teamName;
	}

	@Override
	public int compareTo(Basketball b) {
		// TODO Auto-generated method stub
		if (b.getTeamRate() == getTeamRate()) {
			return 0;
		} else if (getTeamRate() > b.getTeamRate()) {
			return 1;
		} else {
			return -1;
		}
	}

	public void print() {
		System.out.println("Manegr Name: " + getMangerName());
		System.out.println("Team name: ");
		System.out.println("**********************************");
		for (int i = 0; i < teamPlayerName.length; i++) {
			System.out.println("player number: " + (i + 1) + "     player name: " + teamPlayerName[i][0]);
		}
	}

}
