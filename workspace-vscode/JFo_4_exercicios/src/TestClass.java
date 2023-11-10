public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods cm = new ComputeMethods();

        //invoke the 3 methods and dispay their results
        System.out.println("Temp in celsius is " + cm.fToC(100.4));
        System.out.println("Hypotenuse is " + cm.hypotenuse(10, 20));
        System.out.println("The sum of the dice values is " + cm.roll());
        
    }
}
