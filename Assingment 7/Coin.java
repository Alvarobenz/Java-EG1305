import java.util.*;

public class Coin {
	private String sideUp;
	
	public void toss( ){
		Random random = new Random();
		int randNum = 0;
		
		randNum = random.nextInt(2); // 0 to 1
		
		if( randNum == 1)
			sideUp = "heads";
		else
			sideUp = "tails";
		
	}
	
	public String getSideUp(){
		return sideUp;
	}
	
	public void Coin(){
		toss();
	}
	
	
	
}
