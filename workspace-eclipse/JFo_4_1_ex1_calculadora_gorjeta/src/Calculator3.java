public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public double allTotal = 0;
    
    public void findTotal(String name, double price){
        double total = price*(1+tax+tip);
        allTotal += total;
        System.out.println(name + ": $" +total);
    }
}
