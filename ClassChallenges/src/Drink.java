
public class Drink {

	public static void main(String[] args) {
		
		double custEnrg = (12467 * .14);
		double custEnrgCitrus = (custEnrg * .64 );
		
		System.out.println("Customers who purchase one or more energy drinks per week*: " + (int)custEnrg);
		System.out.println("Custmers who perfer citrus flavored energy drinks*: " + (int)custEnrgCitrus);
		
		System.out.println("*According to survey");

	}

}
