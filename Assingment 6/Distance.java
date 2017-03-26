import java.util.*;
import java.lang.*;

public class Distance {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter x1: ");
		int x1 = scan.nextInt();
		System.out.print("Enter y1: ");
		int y1 = scan.nextInt();
		
		System.out.print("Enter x2: ");
		int x2 = scan.nextInt();
		System.out.print("Enter y2: ");
		int y2 = scan.nextInt();
		
		System.out.println("Disance is: " + getDistance(x1, y1, x2, y2));
		
	}
	
	
	
	public static double getDistance(int x1, int y1, int x2, int y2){
		
		return Math.sqrt(Math.pow( (x2 - x1), 2) + Math.pow( (y2 - y1), 2)) ;
		
	}

}

