public class Testcode1 {

	public static void main(String[] args) {
		
		int i = 1;
		
		long startTime = System.nanoTime();
		
		while(i < 1000) {
			
			i++;
				
		}
		
		long finishTime = System.nanoTime();
		
		long difference = finishTime - startTime;
		
		System.out.println("Counting to 1000 takes " + difference + " nanoseconds");
		
		double seconds = difference / 1000000000.0;
		
		System.out.println("Counting to 1000 takes " + seconds + " seconds");
	

	}

}