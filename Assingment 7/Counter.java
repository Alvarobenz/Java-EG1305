
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Counter {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");

		int size = input.nextInt();

		int[] array1 = new int[size];

		randValues(array1);

		System.out.println("The array elements generated are");
		
		for (int i = 0; i < array1.length; i++){
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("\nThere are " + countRepeat(array1) + " numbers that are repeated consecutively");
	}

	
	public static void randValues(int[] array) {
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {	
			array[i] = random.nextInt(9); // 0 to 9;
		}
	}

	
	public static int countRepeat(int[] array) {
		
		int repeat = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++){
				
				if (array[i] == array[j]){
					repeat++;
				}
				
				//System.out.println("array1st " + array[i] + "    array2nd " + array[j] + "    repeat " + repeat);
			}
		}	
		
		return repeat;
	}

}
