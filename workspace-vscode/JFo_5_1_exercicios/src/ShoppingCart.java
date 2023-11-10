public class ShoppingCart {

    public static void main(String[] args) {
        
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	    // numeric fields
        double price = 21.99;
        int quantity = 1;
        double tax = 1.04;
	    double total;
        String message;
        
	    // Calculating total cost
        total = (price*quantity)*tax;
        
        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;
        
        // Test quantity and modify message if quantity > 1.  
        if ( quantity > 1 ) {
            message = custName+" wants to purchase "+quantity+" "+itemDesc+"s";
        } else {
            message = custName+" wants to purchase "+quantity+" "+itemDesc;
        }     
        
        // Test outOfStock and notify user in either case.  
        if ( outOfStock ) {
            System.out.println("Item não está disponível.");
        } else {
            System.out.println(message);
            System.out.println("custo total: " + total);
        }
        
    }
    
}


