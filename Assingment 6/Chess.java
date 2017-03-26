import java.util.*;
import java.lang.*;
import java.math.*;

public class Chess {

	public static void main(String[] args) {

		BigInteger totalGrains = new BigInteger("0");
		long finalGrains = 0;
		int chessBoard = 64;
	
		
		for(int i = 0; i <=chessBoard; i++) {
			
			double calc1 = (Math.pow(2, i));
			
			System.out.println("calc1: " + calc1);
			
			String grain = removeChar(Double.toString(calc1));
			
			System.out.println("Ex: " + grain);
			
			BigInteger temp1 = new BigInteger(grain);
					
			totalGrains = totalGrains.add(temp1);
			
		}
		
		finalGrains = (long)Math.pow(2, chessBoard);
		
		System.out.println("Total grains: " + totalGrains + "\n" + "Final grains: " + finalGrains);
	}
	
	private static String removeChar(String str){
		return str.substring(0, str.length()-2);
	}
	
}
