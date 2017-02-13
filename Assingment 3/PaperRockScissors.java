import java.util.*;

public class PaperRockScissors {

	public static void main(String[] args) {
		//RNG
		Random rand = new Random();
		
		int playermove, cmpmove;
		int win = 0;
		String result = "";
		String winner= ""; 
		String looser = "";
		String gamestatus = "beats";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("scissors (0), rock(1), paper(2): ");
		playermove = scan.nextInt();
		
		//RNG 50 is the max and 1 is min
		cmpmove = rand.nextInt(3) + 1;
		
		//Determine who wins and update win
		if (playermove == cmpmove){
			gamestatus = "ties";
			result = "tied";
			win = 2;		
		}
		else if (playermove == 0 &&  cmpmove == 2) {
			win = 1;
			result = "won";
		}
		else if (playermove == 1 && cmpmove == 0) {
			win = 1;
			result = "won";
		}
		else if (playermove == 2 && cmpmove == 1) {
			win = 1;
			result = "won";
		}
		else if (playermove == 0 && cmpmove == 1) {
			win = 0;
			result = "lost";
		}
		else if (playermove == 1 && cmpmove == 2 ) {
			win = 0;
			result = "lost";
		}
		else if (playermove == 2 && cmpmove == 0) {
			win = 0;
			result = "lost";
		}
	
		switch(win){
			case 0:
			winner = ;
		
		}
			
			
		System.out.printf("You %s: %s %s %s", result, winner, gamestatus, looser);
	

	}

}
