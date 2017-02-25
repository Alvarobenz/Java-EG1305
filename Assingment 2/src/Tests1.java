import java.util.Scanner;

public class Tests1 {

	public static void main(String[] args) {
		 		Scanner stdin = new Scanner(System.in);
		 		
		 		int age = 48;
		 		String choice = "";
		
		
		System.out.println("Enter thing: ");
		choice = stdin.next();
		System.out.println(choice);
		
		if (age < 21){
			if (choice.equals("S"))
				System.out.println("vegetable juice");
			else if (choice.equals("T"))
				System.out.println("cranberry juice");
			else if (choice.equals("B"))
				System.out.println("soda");
		}
		else if (age >= 21) {
			if (choice.equals("S")){
				System.out.println("cabernet");
			}
			else if (choice.equals("T"))
				System.out.println("chardonnay");
			else if (choice.equals("B"))
				System.out.println("IPA");
		}
		else {
			System.out.println("invalid menu selection");
		}

	}

}
