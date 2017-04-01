import java.util.*;
import java.text.*;


public class TestCircle {
	
	private static DecimalFormat df4 = new DecimalFormat(".####");
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Circle1 circle = new Circle1();
		
		System.out.println("Please enter the radius of the circle:");
		double radius = scan.nextDouble();
		circle.Circle1(radius);
		
		System.out.println("The circle's radius is: " + df4.format(circle.getRadius()) );
		System.out.println("The circle's diameter is: " + df4.format(circle.getDiameter()) );
		System.out.println("The circle's area is : "  + df4.format(circle.getArea()) );
		System.out.println("The circle's circumference is: " + df4.format(circle.getCircumfrence()) );
		
		
	}
	
}
