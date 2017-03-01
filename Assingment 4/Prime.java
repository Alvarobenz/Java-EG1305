import java.util.*;

public class Prime {

	public static void main(String[] args) {
		
		//Initialize values
		Scanner scan = new Scanner(System.in);
	
		int i,j;
		int prime = 0, divisor = 0, primeCount = 1;
		int userInput = 0;
		

		System.out.println("Enter a number. The program will print all the prime numbers than this number");
		
		
		//Store userInput
		userInput = scan.nextInt();
		

		for(i=2; i < userInput; i++) {
			
						
			//Highest possible value to check if multiple
			divisor = i / 2;
			
			for(j=2; j<=divisor; j++) {
				if( i%j == 0) {
					prime = 0;
					break;
				}
			}//outer for
			
			//If prime
			if(prime == 1) {
				System.out.printf(i + "\t");
				primeCount++;
			}
			
			//Reset prime
			prime = 1;
		}//end outer for
	
		System.out.println("\n\nThere are a total of " + primeCount + " prime numbers");
		
	}
}
