public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 100;
        double tax = 0.01;
        int quantity = 10;
        
        
        // Declare and assign a calculated totalPrice
        // Vai saber se esse cálculo de imposto está correto...
        double totalPrice = price * quantity * (1+tax);
        
        // Modify message to include quantity 
        message = custName+" wants to purchase " + quantity + " " +itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("O custo total do pedido com o imposto é: $" + totalPrice);
        
        System.out .println("O gato fez \" Miau!\" para mim"); // Exemplo da Oracle Academy. Eu juro!
       
    }    
}
