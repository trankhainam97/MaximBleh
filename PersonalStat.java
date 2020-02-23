import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PersonalStat {
	private TeamPlayerStat teamStat;
	
	private int Person_id;
	private String Player;
	private String Team;
	private String Season_Type;
	private int GP;
	private int Min;
	private int FGM;
	private int FGA;
	private double FG_per;
	private int FG3M;
	private int FG3A;
	private double FG3_per;
	private int FTM;
	private int FTA;
	private double FT_per;
	private int OREB;
	private int DREB;
	private int REB;
	private int AST;
	private int PF;
	private int STL;
	private int TOV;
	private int BLK;
	private int PTS;
	private int CareerHighPTS;
	private double eFG_per;
	private double TS_per;
	
	public PersonalStat(String[] stat) {
		super();
		Person_id = Integer.parseInt(stat[0]);
		Player = stat[1];
		Team = stat[2];
		Season_Type = stat[3];
		GP = Integer.parseInt(stat[4]);
		Min = Integer.parseInt(stat[5]);
		FGM = Integer.parseInt(stat[6]);
		FGA = Integer.parseInt(stat[7]);
		FG_per = Double.parseDouble(stat[8]);
		FG3M = Integer.parseInt(stat[9]);
		FG3A = Integer.parseInt(stat[10]);
		FG3_per = Double.parseDouble(stat[11]);
		FTM = Integer.parseInt(stat[12]);
		FTA = Integer.parseInt(stat[13]);
		FT_per = Double.parseDouble(stat[14]);
		OREB = Integer.parseInt(stat[15]);
		DREB = Integer.parseInt(stat[16]);
		REB = Integer.parseInt(stat[17]);
		AST = Integer.parseInt(stat[18]);
		PF = Integer.parseInt(stat[19]);
		STL = Integer.parseInt(stat[20]);
		TOV = Integer.parseInt(stat[21]);
		BLK = Integer.parseInt(stat[22]);
		PTS = Integer.parseInt(stat[23]);
		CareerHighPTS = Integer.parseInt(stat[24]);
		this.eFG_per = Double.parseDouble(stat[25]);
		TS_per = Double.parseDouble(stat[26]);
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("2KL_Team_Stats.csv"));
			String[] data = null;
			String row = "";
		
			csvReader.readLine();
		
			while ((row = csvReader.readLine()) != null) {
				data = row.split(",");
				if (Team.equals(data[1])) {
					this.teamStat = new TeamPlayerStat(data);
					break;
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public TeamPlayerStat getteamStat() {
		
		return this.teamStat;
	}
	public void setteamStat(TeamPlayerStat teamstat) {
		
		this.teamStat = teamstat;
	}
	
	public int getPerson_id() {
		return this.Person_id;
	}

	public void setPerson_id(int person_id) {
		this.Person_id = person_id;
	}

	public String getPlayer() {
		return Player;
	}

	public void setPlayer(String player) {
		Player = player;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public String getSeason_Type() {
		return Season_Type;
	}

	public void setSeason_Type(String season_Type) {
		Season_Type = season_Type;
	}

	public int getGP() {
		return GP;
	}

	public void setGP(int gP) {
		GP = gP;
	}

	public int getMin() {
		return Min;
	}

	public void setMin(int min) {
		Min = min;
	}

	public int getFGM() {
		return FGM;
	}

	public void setFGM(int fGM) {
		FGM = fGM;
	}

	public int getFGA() {
		return FGA;
	}

	public void setFGA(int fGA) {
		FGA = fGA;
	}

	public double getFG_per() {
		return FG_per;
	}

	public void setFG_per(double fG_per) {
		FG_per = fG_per;
	}

	public double getFG3M() {
		return FG3M;
	}

	public void setFG3M(int fG3M) {
		FG3M = fG3M;
	}

	public int getFG3A() {
		return FG3A;
	}

	public void setFG3A(int fG3A) {
		FG3A = fG3A;
	}

	public double getFG3_per() {
		return FG3_per;
	}

	public void setFG3_per(double fG3_per) {
		FG3_per = fG3_per;
	}

	public int getFTM() {
		return FTM;
	}

	public void setFTM(int fTM) {
		FTM = fTM;
	}

	public int getFTA() {
		return FTA;
	}

	public void setFTA(int fTA) {
		FTA = fTA;
	}

	public double getFT_per() {
		return FT_per;
	}

	public void setFT_per(double fT_per) {
		FT_per = fT_per;
	}

	public int getOREB() {
		return OREB;
	}

	public void setOREB(int oREB) {
		OREB = oREB;
	}

	public int getDREB() {
		return DREB;
	}

	public void setDREB(int dREB) {
		DREB = dREB;
	}

	public int getREB() {
		return REB;
	}

	public void setREB(int rEB) {
		REB = rEB;
	}

	public int getAST() {
		return AST;
	}

	public void setAST(int aST) {
		AST = aST;
	}

	public int getPF() {
		return PF;
	}

	public void setPF(int pF) {
		PF = pF;
	}

	public int getSTL() {
		return STL;
	}

	public void setSTL(int sTL) {
		STL = sTL;
	}

	public int getTOV() {
		return TOV;
	}

	public void setTOV(int tOV) {
		TOV = tOV;
	}

	public int getBLK() {
		return BLK;
	}

	public void setBLK(int bLK) {
		BLK = bLK;
	}

	public int getPTS() {
		return PTS;
	}

	public void setPTS(int pTS) {
		PTS = pTS;
	}

	public int getCareerHighPTS() {
		return CareerHighPTS;
	}

	public void setCareerHighPTS(int careerHighPTS) {
		CareerHighPTS = careerHighPTS;
	}

	public double geteFG_per() {
		return eFG_per;
	}

	public void seteFG_per(double eFG_per) {
		this.eFG_per = eFG_per;
	}

	public double getTS_per() {
		return TS_per;
	}

	public void setTS_per(double tS_per) {
		TS_per = tS_per;
	}
	
	public double pointpergame() {
		return (double)this.PTS/this.GP;
	}
	
	public double teamContrib() {
		double stat = 0.00;
		
		return stat;
	}
	
	public double ranking(PersonalStat player, TeamPlayerStat teamStat, double reb,
			double tov, double oreb, double fga, double pts, double fgm, double ast, 
			double ftm, double pf, double fta) {
		
		double factor = (2/3) - ((0.5 * (ast / fgm)) / (2 * (fgm / ftm)));
		double VOP = pts / (fga - oreb + tov + 0.44 * fta);
		double DRB_per = (reb - oreb) / reb;
		
		double part1 = (double)(FG3M - (double)((PF*ftm) / pf));
		double part2 = (double)2 - (((double)teamStat.getAssists()/(double)(3*teamStat.getField_Goals_Attempted())));
		double part3 = (double)(2 - (double)(factor*(double)teamStat.getAssists()/(double)teamStat.getField_Goals_Attempted()));
		double part4 = (double)(DRB_per * (double)(2*OREB + BLK - (double)(0.2464*(FTA-FTM)) - (FGA - FGM) - REB)
				+ ((0.44*fta*(double)PF)/pf) - (TOV+OREB) + STL + REB - (double)0.1936*(FTA - FTM));
		
		double stat = (double)(part1 + (((double)FTM/2) * part2 + (FGM * part3 + (double)(2*AST)/3 + VOP * part4)));
		
		return stat/Min;
	}
	
	public String toString() {
		return String.format("Person_id %8d, Player %16s, Team %24s, Season Type %8s, GP %2d, Min %3d, FGM %3d, "
				+ "FGA %3d, FG_ %4.3f, FG3M %3d, FG3A %3d, FG3_ %4.3f, FTM %3d, FTA %3d, FT_ %4.3f, OREB %3d, DREB %3d, "
				+ "REB %3d, AST %3d, PF %3d, STL %3d, TOV %3d, BLK %3d, PTS %3d, CareerHighPTS %3d, eFG_ %4.3f, "
				+ "TS_ %4.3f \n\n\n", Person_id,
				Player,
				Team,
				Season_Type,
				GP,
				Min,
				FGM,
				FGA,
				FG_per,
				FG3M,
				FG3A,
				FG3_per,
				FTM,
				FTA,
				FT_per,
				OREB,
				DREB,
				REB,
				AST,
				PF,
				STL,
				TOV,
				BLK,
				PTS,
				CareerHighPTS,
				this.eFG_per,
				TS_per) 
				+ teamStat.toString();
	}
	
}
