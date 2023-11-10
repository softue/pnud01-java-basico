import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número inteiro: ");
        numero = sc.nextInt();

        for (int i=1; i<=12; i++) {
            System.out.printf("%dx%d = %d\n", numero, i, (numero * i));
        }

        sc.close();
    }
}
