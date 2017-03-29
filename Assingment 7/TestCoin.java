
public class TestCoin {
	
	public static void main(String[] args){
		
		Coin quarter = new Coin();
		int tailsCount = 0;
		int headsCount = 0;
		int numToss = 20;
		
		quarter.toss();
		System.out.println( "Side initially facing up: " + quarter.getSideUp());
		
		for( int coinToss =1; coinToss <= numToss; coinToss++){
			quarter.toss();
			
			System.out.println( "Toss " + coinToss + ": " + quarter.getSideUp());
			
			if(quarter.getSideUp() == "heads")
				headsCount++;
			else if(quarter.getSideUp() == "tails")
				tailsCount++;
			
		}
		System.out.println("Out of " + numToss + " tosses, there were " + headsCount + " heads and " + tailsCount + " tails");
		
		
	}
	
	
}
