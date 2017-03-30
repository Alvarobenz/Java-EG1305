import java.util.*;

public class TestFan {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Fan fan = new Fan();
		
		//Temp files
		int speed1 = 0;
		boolean fanStatus1 = false;
		double radius1 = 0;
		String color1 = "";
		
		System.out.println("Enter fan speed: ");
		speed1 = scan.nextInt();
		System.out.println("Enter fan radius: ");
		radius1 = scan.nextDouble();
		System.out.println("Enter fan Fan Status: ");
		fanStatus1 = scan.nextBoolean();
		System.out.println("Enter fan color: ");
		color1 = scan.next();
		
		fan.fan(speed1, fanStatus1, radius1, color1);
		
		System.out.println("\n" + fan.toString());
		
		
	}
	
}
