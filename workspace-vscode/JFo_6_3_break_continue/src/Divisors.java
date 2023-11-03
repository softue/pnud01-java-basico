import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
        System.out.print("Divisors of " + num + " " + "=" + " " );

        // de 1 até 0 número-1
        for (int i = 1; i < num; i++) {
            if (num % i != 0) { // se o número não for divisível por i, pula, ignorando o print
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println(num);
        console.close();
    }
}
