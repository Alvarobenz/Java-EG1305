
public class Circle1 {
	
	private double radius;
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getCircumfrence(){
		return 2 * Math.PI * radius;
	}
	
	public void Circle1(double r){
		radius = r;
	}
	
	public Circle1(){
		
	}

}
