import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]) {
        
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int numero = console.nextInt();
        while ( numero < 0) {
            System.out.print("Type a non-negative integer: ");
            numero = console.nextInt();
        }
        System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));
        console.close();
    }

}
