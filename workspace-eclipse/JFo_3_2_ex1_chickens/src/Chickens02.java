public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	int totalEggs = 0;
 	
    	totalEggs += 100; // segunda    	
    	totalEggs += 121; // terca
    	totalEggs += 117; // quarta
    	
		double dailyAverage = totalEggs / 3.0;
		double monthlyAverage = dailyAverage * 30;
		double monthlyProfit = monthlyAverage * 0.18;
		    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
