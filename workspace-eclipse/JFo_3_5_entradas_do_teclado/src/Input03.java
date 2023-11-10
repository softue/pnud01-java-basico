import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the user
        System.out.print("Insira o primeiro número: ");
        int numberOne = sc.nextInt();
        
        System.out.print("Insira o segundo número: ");
        int numberTwo = sc.nextInt();
        
        System.out.print("Insira o terceiro número: ");
        int numberThree = sc.nextInt();
        System.out.print(numberOne + numberTwo + numberThree);
        
        //Remember to close the Scanner
        sc.close();
    }
}
