import static org.junit.Assert.*;

import org.junit.Test;

public class CurrentOver {

	cricketSystem matchInn1;
	Scores score;
	
	@Test
	public void test() {
		matchInn1 = new cricketSystem("IND","ENG",5);
		score = new Scores(matchInn1);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, matchInn1.getCurrentOver()+1);
	}

}