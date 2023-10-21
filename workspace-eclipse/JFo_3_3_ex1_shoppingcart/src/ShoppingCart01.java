public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
    	// Declare e inicialize a variável de String custName
    	// char custSex = "M"; // não pode converter de String to char
        String custName = "Rômulo";
        
        // Declare e inicialize a variável de String itemDesc
        String itemDesc = "Celular";
        
        // Declare uma variável de String message
        String message;
        
        // Assign the message variable 
        message = custName + " comprou um " + itemDesc + ".";
        
        // Print and run the code
        System.out.println(message);
        
    	// Cuidado quando for concatenar números
        String totalPrice1 = "Total: $" + 3 + 2 + 1;
		System.out.println(totalPrice1); //Total: $321
		
        String totalPrice2 = "Total: $" + (3 + 2 + 1);
		System.out.println(totalPrice2); //Total: $6
		
        
    }
}
