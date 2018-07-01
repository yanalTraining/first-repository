
public abstract class Team {
	
	
	private String teamName;
	private String teamType;// team type
	private int teamId;
	private int numOfTeamMem;// number of team member
	private String mangerName;
	private int teamRate;

	public Team(String teamType, int teamId, String mangerName) {
		super();
		this.teamType = teamType;
		this.teamId = teamId;
		this.mangerName = mangerName;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String type) {
		this.teamType = type;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getMangerName() {
		return mangerName;
	}

	public void setMangerName(String mangerName) {
		this.mangerName = mangerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumOfTeamMem() {
		return numOfTeamMem;
	}

	public void setNumOfTeamMem(int numOfTeamMem) {
		this.numOfTeamMem = numOfTeamMem;
	}

	public int getTeamRate() {
		return teamRate;
	}

	public void setTeamRate(int teamRate) {
		this.teamRate = teamRate;
	}

	public abstract void print();

}
