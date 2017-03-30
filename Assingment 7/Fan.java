
public class Fan {

	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	private String color = "blue";
	
	
	public void fan(int speed1, boolean fanStatus1, double radius1, String color1){
		
		speed = speed1;
		fanStatus = fanStatus1;
		radius = radius1;
		color = color1;
		
	}
	
	public String toString(){
		return "Fan speed: " + speed + "\n" + "Color: " + color + "\n" + "Radius: " + radius + "\n" + "Fan status: " + ((fanStatus == true) ? "True" : "False");
		
	}
	
	public Fan(){
	
	}
	
}
