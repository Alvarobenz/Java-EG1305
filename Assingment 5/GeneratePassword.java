import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class GeneratePassword {

	public static void main(String[] args) {
		
		int i;
		int userInput = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many digits would you like to use for a numeric password?\n");
		userInput = scan.nextInt();
		
		System.out.println("Your password is");
		
		for(i=0; i < userInput; i++){
			System.out.printf( Integer.toString(randomGenerator()) + " " );
			
		}
		
		
	}
	
	public static int randomGenerator() {
		
		Random rand = new Random();
		
		int rng = 0;
		
		rng = rand.nextInt(9);
		
		return rng;
				
	}

}
