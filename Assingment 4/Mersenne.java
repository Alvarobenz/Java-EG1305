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
		
		
		while(mersenne <= userInput) {
			i = 2;
					
			if(isprime(i)){
				mersenne = ( Math.pow(2, i) ) - 1;
				
				if(isprime((int)mersenne)){
					System.out.println(mersenne +"\t");
					mersenneCount++;
				}
				
			}//outer if
			i++;
		}//outer for
		
		System.out.println("There are a total of " + mersenne + " prime numbers" );
		

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
