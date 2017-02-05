
public class StockTransaction {

	public static void main(String[] args) {
		final double COMMISSION_RATE = .02;
		int sharesPurchased = 1000;
		double	joePaid = (sharesPurchased * 32.87);
		double commission1 = (joePaid * COMMISSION_RATE);
		double totalPaid = (commission1 + joePaid);
		double joeSold = (sharesPurchased * 33.92);
		double commission2 = (joeSold * COMMISSION_RATE);
		double totalSold = (commission2 + joeSold);
		double profit = (totalSold - totalPaid);
		
		// This formula is not correct. First calculate the profit: sold - bought, then take off the commission to find the net profit.
		
		System.out.println("Shares Purchased: $" + joePaid); 
		System.out.println("Commission paid to broker for purchase: $" + commission1);
		System.out.println("Stocks sold for: $" + joeSold );
		System.out.println("Commission paid to broker for: $" + commission2);
		System.out.println("Profit: $"+ profit);
		
	}

}
