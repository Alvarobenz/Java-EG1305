/* Format your code using Ctrl+Shift+F in Eclipse
Leave spaces on both sides of an operator
*/
import java.util.Scanner;

public class CountMoney {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an amount in integer, for example 1156 "
				+ "for 11 dollars and 56 cents: ");
		
		int integer1 = scan.nextInt();
		
		int dollars = integer1 / 100;
		int cents = integer1 % 100;
		int quarters = cents / 25;		
		int dimes = (cents - quarters*25) / 10;
		int nickels = (cents - (quarters*25) - (dimes*10)) / 5; //Use spaces (quarters * 25)
		int pennies = (cents - (quarters*25) - (dimes*10) - (nickels*5)) / 1;
		
		System.out.println("Your amount " + integer1 + " consists of\n" + dollars + "   dollars\n" 
				+ quarters + "   quarters\n" + dimes + "   dimes\n" + nickels 
				+ "   nickels\n" + pennies + "   pennies" ); 
		
	}
}
