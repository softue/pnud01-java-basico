import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        //System.out.print("Enter a number (-1 to quit): ");
        //int number = console.nextInt();

        //while (number != -1) {
        do {
            sum = sum + number; // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        } while ( number != -1 );

        System.out.println("The sum is " + sum);
        console.close();
    }
}
