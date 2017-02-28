import java.util.*;

import javax.swing.JOptionPane;

public class NumberGuess {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int randomInt = 0;
		int userInput = 0;
		boolean status = true;
		
		//RNG 1 - 100
		randomInt = rand.nextInt(100) + 1;
		
		System.out.println("Enter a number between 1 and 100");
		
		while(status) {
			
			userInput = Integer.parseInt(JOptionPane.showInputDialog("" + "\n"));
			System.out.println("" + userInput);
			
			if(userInput == randomInt)
				status = false;
			else if(userInput > randomInt)
				System.out.println("Guess lower");
			else if(userInput < randomInt)
				System.out.println("Guess higher");
			else
				System.out.println("Invalid entry try again");
		

		}//end while loop
		
		
		System.out.println("You guessed it right");
		

	}

}
