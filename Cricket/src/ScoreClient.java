public class ScoreClient {

	public static void main(String[] args) {
		cricketSystem  matchInn1 = new cricketSystem ("ENG","ING",5);
		Scores score = new Scores(matchInn1);
		
		score.addScore(1);
		score.addScore(2);
		score.addScore(0);
		score.addScore(1);
		score.addScore(2);
		score.addScore(2);

		score.addScore(2);
		score.addScore(2);
		score.addScore(0);
		score.addScore(1);
		score.addScore(2);
		score.addScore(2);

		//score.addScore(7);
		
		Debugger.Log("Current Over : "+ ( matchInn1.getCurrentOver()+1 ));
		Debugger.Log("Current Ball : "+matchInn1.getCurrentOverBall());
		Debugger.Log("Current Over Score "+score.getScoreInOver(matchInn1.getCurrentOver()));
		Debugger.Log("Total Score : "+score.getCurrentScore());
	}

}