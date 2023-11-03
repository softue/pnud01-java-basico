import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        String pinCorreto = "1234";
        String pinDigitado = "0000";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu PIN: ");
        while ( pinCorreto != pinDigitado ) {
            pinDigitado = sc.nextLine();
            if ( pinDigitado.equals(pinCorreto) ) {
                break;
            }
            System.out.print("Por favor, digite seu PIN novamente: ");
        }
        System.out.println("PIN correto inserido!");
        sc.close();
    }
}
