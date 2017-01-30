import java.text.DecimalFormat;

public class ClassTest1 {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		double radius = 10;
		double area = (Math.PI*radius*radius);
		double permimeter = (2*Math.PI*radius);
		
		
		System.out.println("Radius is: " + radius );
		System.out.println("Area is: " + formatter.format(area) ); 	
		System.out.println("Perimeter is: " + formatter.format(permimeter) );

	}

}
