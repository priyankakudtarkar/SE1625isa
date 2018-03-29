public class cricketSystem {
	
	private String team1, team2;
	private int totalOvers = 0;
	private int currentOver = 0;
	
	private Overr[] overs;
	
	
	public cricketSystem(String t1, String t2, int o) {
		team1 = t1;
		team2 = t2;
		totalOvers = o;
		overs = new Overr[totalOvers];
		for(int i=0; i<totalOvers; i++){
			overs[i]= new Overr();
		}
	}
	
	public int getTotalOvers() {
		return totalOvers;
	}
	
	public Overr getOverAt(int i) {
		return overs[i];
	}
	
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	public int addScore(int score){
		int s=0;
		if(currentOver<totalOvers){
			overs[currentOver].addScore(score);
			if(overs[currentOver].getCurrentBall()==6){
				currentOver++;
			}
			s=score;
		}
		return s;
	}
	
	public int getCurrentOver() {
		return currentOver;
	}
	
	public int getCurrentOverBall() {
		return overs[currentOver].getCurrentBall();
	}
}