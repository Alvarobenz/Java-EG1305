import java.text.DecimalFormat;

public class Circle {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.000");
		
		int radius = 5;
		double area = (Math.PI*radius*radius);
		double diameter = (radius*2);
		
		System.out.println("The circle's radius is " + radius + ", the area is " + formatter.format(area) );
		System.out.println("The Diameter is " + diameter);

	}

}
