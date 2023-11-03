import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 10 números.");
        System.out.println("Informe 0 para sair.");

        for ( int i = 1; i<=10; i++) {
            numero = sc.nextInt();
            if ( numero == 0 ) {
                break;
            }
            soma += numero;
        }

        System.out.println("A soma dos números informados é " + soma);

        sc.close();
    }
}