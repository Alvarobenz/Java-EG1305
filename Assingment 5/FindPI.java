import java.lang.*;
import java.text.DecimalFormat;

public class FindPI {
	
	private static DecimalFormat df3 = new DecimalFormat(".###");
	
	public static void main(String[] args) {
		
		int iterations = 2500000;
		double PI = 0;
		int i;
		long startTime = System.nanoTime();
		
		for (i=1; i <= iterations; i++ ) {
			
			PI += (Math.pow(-1, i+1 ) / (2*i - 1) * 4);
			
			
		}
		
		long finishTime = System.nanoTime();
		long timeDiff = finishTime - startTime;
		
		double seconds = (double)timeDiff / 1000000000;
		
		System.out.println("PI = " + PI + " after " + iterations + " iterations");
		System.out.println("It took " + df3.format(seconds) + " seconds to complete this operation");
		

	}

}
