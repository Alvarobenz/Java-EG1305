import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		
		int integer1 = 0; 
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		integer1 = scan.nextInt();
		int integer1temp = integer1;
		
		//Get first digit
		sum += (integer1 % 10);
		integer1 /= 10;
		
		//Get second digit
		sum += (integer1 % 10);
		integer1 /= 10;
		
		//Get third digit
		sum += (integer1 % 10);
		
		System.out.println("The sum of all digits in " + integer1temp + " is " + sum);
		

	}

}
