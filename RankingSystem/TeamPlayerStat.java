
public class TeamPlayerStat {
	private int Team_ID;
	private String Nickname;
	private int Games_Played;
	private int Sum_Player_MIN;
	private int Team_MIN;
	private int Points;
	private int Field_Goals;
	private int Field_Goals_Attempted;
	private double FG_per;
	private int Three_Pointers;
	private int Three_Pointers_Attempted;
	private double Three_Pointers_per;
	private int Offensive_Rebounds;
	private int Defensive_Rebounds;
	private int Assists;
	private int Steals;
	private int Turnovers;
	private int Blocked_Shots;
	private int Points1;
	private int PT_Differential;
	private int Opp_FGM;
	private int Opp_FGA;
	private double Opp_FG_per;
	private int Opp_3PM;
	private int Opp_3PA;
	private double Opp_3P_per;
	private int Opp_OREB;
	private int Opp_DREB;
	private int Opp_AST;
	private int Opp_STL;
	private int Opp_TOV;
	private int Opp_BLK;
	
	
	
	public TeamPlayerStat(int team_ID, String nickname, int games_Played, int sum_Player_MIN, int team_MIN, int points,
			int field_Goals, int field_Goals_Attempted, double fG_per, int three_Pointers, int three_Pointers_Attempted,
			double three_Pointers_per, int offensive_Rebounds, int defensive_Rebounds, int assists, int steals,
			int turnovers, int blocked_Shots, int points1, int pT_Differential, int opp_FGM, int opp_FGA,
			double opp_FG_per, int opp_3pm, int opp_3pa, double opp_3p_per, int opp_OREB, int opp_DREB, int opp_AST,
			int opp_STL, int opp_TOV, int opp_BLK) {
		super();
		Team_ID = team_ID;
		Nickname = nickname;
		Games_Played = games_Played;
		Sum_Player_MIN = sum_Player_MIN;
		Team_MIN = team_MIN;
		Points = points;
		Field_Goals = field_Goals;
		Field_Goals_Attempted = field_Goals_Attempted;
		FG_per = fG_per;
		Three_Pointers = three_Pointers;
		Three_Pointers_Attempted = three_Pointers_Attempted;
		Three_Pointers_per = three_Pointers_per;
		Offensive_Rebounds = offensive_Rebounds;
		Defensive_Rebounds = defensive_Rebounds;
		Assists = assists;
		Steals = steals;
		Turnovers = turnovers;
		Blocked_Shots = blocked_Shots;
		Points1 = points1;
		PT_Differential = pT_Differential;
		Opp_FGM = opp_FGM;
		Opp_FGA = opp_FGA;
		Opp_FG_per = opp_FG_per;
		Opp_3PM = opp_3pm;
		Opp_3PA = opp_3pa;
		Opp_3P_per = opp_3p_per;
		Opp_OREB = opp_OREB;
		Opp_DREB = opp_DREB;
		Opp_AST = opp_AST;
		Opp_STL = opp_STL;
		Opp_TOV = opp_TOV;
		Opp_BLK = opp_BLK;
	}
	
	public TeamPlayerStat(String[] stat) {
		super();
		Team_ID = Integer.parseInt(stat[0]);
		Nickname = stat[1];
		Games_Played = Integer.parseInt(stat[2]);
		Sum_Player_MIN = Integer.parseInt(stat[3]);
		Team_MIN = Integer.parseInt(stat[4]);
		Points = Integer.parseInt(stat[5]);
		Field_Goals = Integer.parseInt(stat[6]);
		Field_Goals_Attempted = Integer.parseInt(stat[7]);
		FG_per = Double.parseDouble(stat[8]);
		Three_Pointers = Integer.parseInt(stat[9]);
		Three_Pointers_Attempted = Integer.parseInt(stat[10]);
		Three_Pointers_per = Double.parseDouble(stat[11]);
		Offensive_Rebounds = Integer.parseInt(stat[12]);
		Defensive_Rebounds = Integer.parseInt(stat[13]);
		Assists = Integer.parseInt(stat[14]);
		Steals = Integer.parseInt(stat[15]);
		Turnovers = Integer.parseInt(stat[16]);
		Blocked_Shots = Integer.parseInt(stat[17]);
		Points1 = Integer.parseInt(stat[18]);
		PT_Differential = Integer.parseInt(stat[19]);
		Opp_FGM = Integer.parseInt(stat[20]);
		Opp_FGA = Integer.parseInt(stat[21]);
		Opp_FG_per = Double.parseDouble(stat[22]);
		Opp_3PM = Integer.parseInt(stat[23]);
		Opp_3PA = Integer.parseInt(stat[24]);
		Opp_3P_per = Double.parseDouble(stat[25]);
		Opp_OREB = Integer.parseInt(stat[26]);
		Opp_DREB = Integer.parseInt(stat[27]);
		Opp_AST = Integer.parseInt(stat[28]);
		Opp_STL = Integer.parseInt(stat[29]);
		Opp_TOV = Integer.parseInt(stat[30]);
		Opp_BLK = Integer.parseInt(stat[31]);
	}
	
	public int getTeam_ID() {
		return Team_ID;
	}
	public void setTeam_ID(int team_ID) {
		Team_ID = team_ID;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public int getGames_Played() {
		return Games_Played;
	}
	public void setGames_Played(int games_Played) {
		Games_Played = games_Played;
	}
	public int getSum_Player_MIN() {
		return Sum_Player_MIN;
	}
	public void setSum_Player_MIN(int sum_Player_MIN) {
		Sum_Player_MIN = sum_Player_MIN;
	}
	public int getTeam_MIN() {
		return Team_MIN;
	}
	public void setTeam_MIN(int team_MIN) {
		Team_MIN = team_MIN;
	}
	public int getPoints() {
		return Points;
	}
	public void setPoints(int points) {
		Points = points;
	}
	public int getField_Goals() {
		return Field_Goals;
	}
	public void setField_Goals(int field_Goals) {
		Field_Goals = field_Goals;
	}
	public int getField_Goals_Attempted() {
		return Field_Goals_Attempted;
	}
	public void setField_Goals_Attempted(int field_Goals_Attempted) {
		Field_Goals_Attempted = field_Goals_Attempted;
	}
	public double getFG_per() {
		return FG_per;
	}
	public void setFG_per(double fG_per) {
		FG_per = fG_per;
	}
	public int getThree_Pointers() {
		return Three_Pointers;
	}
	public void setThree_Pointers(int three_Pointers) {
		Three_Pointers = three_Pointers;
	}
	public int getThree_Pointers_Attempted() {
		return Three_Pointers_Attempted;
	}
	public void setThree_Pointers_Attempted(int three_Pointers_Attempted) {
		Three_Pointers_Attempted = three_Pointers_Attempted;
	}
	public double getThree_Pointers_per() {
		return Three_Pointers_per;
	}
	public void setThree_Pointers_per(double three_Pointers_per) {
		Three_Pointers_per = three_Pointers_per;
	}
	public int getOffensive_Rebounds() {
		return Offensive_Rebounds;
	}
	public void setOffensive_Rebounds(int offensive_Rebounds) {
		Offensive_Rebounds = offensive_Rebounds;
	}
	public int getDefensive_Rebounds() {
		return Defensive_Rebounds;
	}
	public void setDefensive_Rebounds(int defensive_Rebounds) {
		Defensive_Rebounds = defensive_Rebounds;
	}
	public int getAssists() {
		return Assists;
	}
	public void setAssists(int assists) {
		Assists = assists;
	}
	public int getSteals() {
		return Steals;
	}
	public void setSteals(int steals) {
		Steals = steals;
	}
	public int getTurnovers() {
		return Turnovers;
	}
	public void setTurnovers(int turnovers) {
		Turnovers = turnovers;
	}
	public int getBlocked_Shots() {
		return Blocked_Shots;
	}
	public void setBlocked_Shots(int blocked_Shots) {
		Blocked_Shots = blocked_Shots;
	}
	public int getPoints1() {
		return Points1;
	}
	public void setPoints1(int points1) {
		Points1 = points1;
	}
	public int getPT_Differential() {
		return PT_Differential;
	}
	public void setPT_Differential(int pT_Differential) {
		PT_Differential = pT_Differential;
	}
	public int getOpp_FGM() {
		return Opp_FGM;
	}
	public void setOpp_FGM(int opp_FGM) {
		Opp_FGM = opp_FGM;
	}
	public int getOpp_FGA() {
		return Opp_FGA;
	}
	public void setOpp_FGA(int opp_FGA) {
		Opp_FGA = opp_FGA;
	}
	public double getOpp_FG_per() {
		return Opp_FG_per;
	}
	public void setOpp_FG_per(double opp_FG_per) {
		Opp_FG_per = opp_FG_per;
	}
	public int getOpp_3PM() {
		return Opp_3PM;
	}
	public void setOpp_3PM(int opp_3pm) {
		Opp_3PM = opp_3pm;
	}
	public int getOpp_3PA() {
		return Opp_3PA;
	}
	public void setOpp_3PA(int opp_3pa) {
		Opp_3PA = opp_3pa;
	}
	public double getOpp_3P_per() {
		return Opp_3P_per;
	}
	public void setOpp_3P_per(double opp_3p_per) {
		Opp_3P_per = opp_3p_per;
	}
	public int getOpp_OREB() {
		return Opp_OREB;
	}
	public void setOpp_OREB(int opp_OREB) {
		Opp_OREB = opp_OREB;
	}
	public int getOpp_DREB() {
		return Opp_DREB;
	}
	public void setOpp_DREB(int opp_DREB) {
		Opp_DREB = opp_DREB;
	}
	public int getOpp_AST() {
		return Opp_AST;
	}
	public void setOpp_AST(int opp_AST) {
		Opp_AST = opp_AST;
	}
	public int getOpp_STL() {
		return Opp_STL;
	}
	public void setOpp_STL(int opp_STL) {
		Opp_STL = opp_STL;
	}
	public int getOpp_TOV() {
		return Opp_TOV;
	}
	public void setOpp_TOV(int opp_TOV) {
		Opp_TOV = opp_TOV;
	}
	public int getOpp_BLK() {
		return Opp_BLK;
	}
	public void setOpp_BLK(int opp_BLK) {
		Opp_BLK = opp_BLK;
	}
	
	public double pointpergame() {
		return (double)this.Points/16;
	}

	//Override
	public String toString() {
		return "TeamPlayerStat [Team_ID=" + Team_ID + ", Nickname=" + Nickname + ", Games_Played=" + Games_Played
				+ ", Sum_Player_MIN=" + Sum_Player_MIN + ", Team_MIN=" + Team_MIN + ", Points=" + Points
				+ ", Field_Goals=" + Field_Goals + ", Field_Goals_Attempted=" + Field_Goals_Attempted + ", FG_per="
				+ FG_per + ", Three_Pointers=" + Three_Pointers + ", Three_Pointers_Attempted="
				+ Three_Pointers_Attempted + ", Three_Pointers_per=" + Three_Pointers_per + ", Offensive_Rebounds="
				+ Offensive_Rebounds + ", Defensive_Rebounds=" + Defensive_Rebounds + ", Assists=" + Assists
				+ ", Steals=" + Steals + ", Turnovers=" + Turnovers + ", Blocked_Shots=" + Blocked_Shots + ", Points1="
				+ Points1 + ", PT_Differential=" + PT_Differential + ", Opp_FGM=" + Opp_FGM + ", Opp_FGA=" + Opp_FGA
				+ ", Opp_FG_per=" + Opp_FG_per + ", Opp_3PM=" + Opp_3PM + ", Opp_3PA=" + Opp_3PA + ", Opp_3P_per="
				+ Opp_3P_per + ", Opp_OREB=" + Opp_OREB + ", Opp_DREB=" + Opp_DREB + ", Opp_AST=" + Opp_AST
				+ ", Opp_STL=" + Opp_STL + ", Opp_TOV=" + Opp_TOV + ", Opp_BLK=" + Opp_BLK + "]\n";
	}
	
	
}
