import java.util.*;
import java.lang.*;

public class Chess {

	public static void main(String[] args) {

		long totalGrains = 1;
		long finalGrains = 0;
		int chessBoard = 64;
	
		
		for(int i = 1; i <= chessBoard; i++) {
			totalGrains += Math.pow(2, i) - 1;
			
		}
		
		finalGrains = (long)Math.pow(2, chessBoard);
		
		System.out.println("Total grains: " + totalGrains + "\n" + "Final grains: " + finalGrains);
	}
	
}
