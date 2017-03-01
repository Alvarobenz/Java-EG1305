import java.util.Scanner;
import java.lang.*;

public class Mersenne {

	public static void main(String[] args) {

		//Initialize values
		Scanner scan = new Scanner(System.in);
	
		int i,j;
		double mersenne = 0;
		int mersenneCount = 0;
		int userInput = 0;

		System.out.println("Enter a number. The program will print all the Mersenne prime numbers than this number");
		
		
		//Store userInput
		userInput = scan.nextInt();
		
		i = 2;
		while(mersenne < userInput) {
			
			if(isprime(i)){
				mersenne = ( Math.pow(2, i) ) - 1;
				
				if(mersenne < userInput) {
					
					if(isprime((int)mersenne)){
						System.out.printf((int)mersenne + "\t");
						mersenneCount++;
					}//inner
				}//outer
			}//outer if
			i++;
		}
		
		System.out.println("\nThere are a total of " + mersenneCount + " mersenne prime numbers" );
		

	}
	
	
	
	public static boolean isprime(int a) {
		
		int j;
		int divisor = 0, prime = 1;
		
		divisor = a / 2;
		
		for(j=2; j<=divisor; j++) {
			if( a%j == 0) {
				prime = 0;
				break;
			}
		}//outer for
		
		//If prime
		if(prime == 1) {
			return true;
		}
		else
			return false;
		
		
	}

}
