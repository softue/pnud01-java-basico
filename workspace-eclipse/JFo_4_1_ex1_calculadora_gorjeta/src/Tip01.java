public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
    	System.out.println("person 1: " + (10*1.05*1.15));
    	System.out.println("person 2: " + (12*1.05*1.15));
    	System.out.println("person 3: " + (9*1.05*1.15));
    	System.out.println("person 4: " + (8*1.05*1.15));
    	System.out.println("person 5: " + (7*1.05*1.15));
    	System.out.println("person 6: " + (15*1.05*1.15));
    	System.out.println("person 7: " + (11*1.05*1.15));
    	System.out.println("person 8: " + (30*1.05*1.15));
        
    }    
}
