import java.util.Scanner;
import java.text.DecimalFormat;

public class CompareNumbers {

	private static DecimalFormat df2 = new DecimalFormat(".##");
	
	public static void main(String[] args) {
		
		int int1, int2, int3, sum, product;
		int smallest = 0;
		int largest = 0;
		double average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int1 = scan.nextInt();
		
		System.out.println("Enter second integer: ");
		int2 = scan.nextInt();
		
		System.out.println("Enter third integer: ");
		int3 = scan.nextInt();
		
		//Largest test
		if (int1 >= int2 && int1 >= int3) {
			largest = int1;
		}
		else if (int2 >= int1 && int2 >= int3) {
			largest = int2;
		}
		else if (int3 >= int2 && int3 >= int1) {
			largest = int3;
		}
		
		//Smallest test
		if (int1 <= int2 && int1 <= int3) {
			smallest = int1;
		}
		else if (int2 <= int1 && int2 <= int3) {
			smallest = int2;
		}
		else if (int3 <= int2 && int3 <= int1) {
			smallest = int3;
		}
		
		sum = int1 + int2 + int3;
		product = int1 * int2 * int3;
		average = (double)sum / 3;
		
		
		System.out.printf("For the numbers %d, %d, and %d \nLargest is %d\nSmallest is %d\nSum is %d\n"
				+ "Product is %d\nAverage is " + df2.format(average), int1, int2, int3, largest, smallest
				, sum, product);
	}

}