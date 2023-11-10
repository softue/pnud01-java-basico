public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
    public double findTotal(String name, double price){
        double total = (price + 15/7.0) *(1+tax+tip);
        System.out.println(name + ": $" + total);
        return total;
    }
}
