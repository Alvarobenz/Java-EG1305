import java.util.*;

public class PaperRockScissors {

	public static void main(String[] args) {
		//RNG
		Random rand = new Random();
		
		int playerMove, cmpMove;
		int win = 0;
		
		//String copies to store string versions of 0,1,2
		String playerMoveSt = "";
		String cmpMoveSt = "";
		
		String result = "";
		String winner= ""; 
		String looser = "";
		String gamestatus = "beats";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("scissors (0), rock(1), paper(2): ");
		playerMove = scan.nextInt();
		
		//RNG 3 is the max and 1 is min
		cmpMove = rand.nextInt(3) + 1;
		
		//Determine who wins and update win
		if (playerMove == cmpMove){
			gamestatus = "ties";
			result = "tied";
			win = 2;		
		}
		else if (playerMove == 0 &&  cmpMove == 2) {
			win = 1;
			result = "won";
		}
		else if (playerMove == 1 && cmpMove == 0) {
			win = 1;
			result = "won";
		}
		else if (playerMove == 2 && cmpMove == 1) {
			win = 1;
			result = "won";
		}
		else if (playerMove == 0 && cmpMove == 1) {
			win = 0;
			result = "lost";
		}
		else if (playerMove == 1 && cmpMove == 2 ) {
			win = 0;
			result = "lost";
		}
		else if (playerMove == 2 && cmpMove == 0) {
			win = 0;
			result = "lost";
		}
		
		//Updates string version of playerMoveSt
		switch(playerMove){
			case 0:
			playerMoveSt = "Scissors";
			break;
			case 1:
			playerMoveSt = "Rock";
			break;
			case 2:
			playerMoveSt = "Paper";
		}
		
		//Updates string version of cmpMoveSt
		switch(cmpMove){
			case 0:
			cmpMoveSt = "Scissors";
			break;
			case 1:
			cmpMoveSt = "Rock";
			break;
			case 2:
			cmpMoveSt = "Paper";
		}
		switch(win){
			case 0:
			winner = cmpMoveSt;
			looser = playerMoveSt;
			break;
			case 1:
			winner = playerMoveSt;
			looser = cmpMoveSt;
			break;
			case 2:
			winner = playerMoveSt;
			looser = cmpMoveSt;
		}
		
	
		System.out.printf("You %s: %s %s %s", result, winner, gamestatus, looser);
	

	}

}
