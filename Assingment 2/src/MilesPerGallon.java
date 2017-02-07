import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many miles have you driven?: ");
		int miles = scan.nextInt();
		
		System.out.println("Gallos used on drive?: ");
		int gallons = scan.nextInt();
		
		//.printf to use double
		double mpg = (double) miles / gallons;
		System.out.printf("MPG for this trip is: %.2f ", mpg );
		
	}

}
