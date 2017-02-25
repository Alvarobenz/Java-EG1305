import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		int year, month, feb; 
		int daysInMonth = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Month archieve\n\nPlease enter year: ");
		year = scan.nextInt();
		
		System.out.println("Please enter a month 1-12: ");
		month = scan.nextInt();
		
		//If year divisible by 4 or 400 = leap year
		if (year % 4 == 0 || year % 400 == 0) {
			feb = 29;
		}
		else {
			feb = 28;
		}
		
		//Update daysInMonth
		switch (month)
		{
			case 1: 
				daysInMonth = 31;
				break;
			case 2: 
				daysInMonth = feb;
				break;
			case 3: 
				daysInMonth = 31;
				break;
			case 4:
				daysInMonth = 30;
				break;
			case 5:
				daysInMonth = 31;
				break;
			case 6:
				daysInMonth = 30;
				break;
			case 7:
				daysInMonth = 31;
				break;
			case 8: 
				daysInMonth = 31;
				break;
			case 9:
				daysInMonth = 30;
				break;
			case 10:
				daysInMonth = 31;
				break;
			case 11: 
				daysInMonth = 30;
				break;
			case 12: 
				daysInMonth = 31;
				break;
		}
		
		System.out.printf("There are %d days in %d/%d", daysInMonth, month, year);
		
	}

}
