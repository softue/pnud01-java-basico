public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.1";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax = Double.parseDouble(shirtPrice) * Double.parseDouble(taxRate);
        System.out.println(totalTax);
        
        //Try to parse taxRate as an int
        //The method parseInt(String) in the type Integer is not applicable for the arguments (double)
        System.out.println(Integer.parseInt(totalTax));
        
        //Try to parse gibberish as an int
        //NumberFormatException
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "887ds7nds87dsfs"
        System.out.println(Integer.parseInt(gibberish)); 
        
    }
    
}
