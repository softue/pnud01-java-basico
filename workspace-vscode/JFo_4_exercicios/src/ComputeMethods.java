import java.util.Random;


public class ComputeMethods {
    
    public double fToC(double degreesF) {
        // C=5/9*(F-32)
        double c = 5.0 / 9 * (degreesF - 32);
        return c;
    }
    
    public double hypotenuse(int a, int b) {
        // C = raiz(a^2 + b^2)
        double c = Math.sqrt(a * a + b * b);
        return c;
    }
    
    public int roll() {
        Random rnd = new Random();
        int firstRoll = rnd.nextInt(6) + 1; // de 1 até 6
        int secondRoll = rnd.nextInt(6) + 1;
        return firstRoll + secondRoll;
    }
    
}

