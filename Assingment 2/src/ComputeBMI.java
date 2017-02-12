import java.util.*;
import javax.swing.JOptionPane;

public class ComputeBMI {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//initialize strings for JOptionPane
		String weight1;
		String height1;
		
		weight1 = JOptionPane.showInputDialog("Enter your weight in pounds.");
		height1 = JOptionPane.showInputDialog("Enter your height in inches.");
		
		//Convert back to int to calc BMI
		double weight2 = Integer.parseInt(weight1);
		double height2 = Integer.parseInt(height1);
		
		double bmi = ((weight2)*0.45359237) / ( Math.sqrt( (height2*.0254) ) );
		
		JOptionPane.showMessageDialog(null, "Your body mass index number is " + bmi );
		
		System.exit(0);
		
		
		
		
		
	}

}
