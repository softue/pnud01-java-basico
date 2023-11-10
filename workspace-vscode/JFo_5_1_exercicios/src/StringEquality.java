import java.util.Scanner;

public class StringEquality {


    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        nome = sc.nextLine();
        if ( nome.equals("Moe" ) ) {
            System.out.println("Você é o rei do rock and roll");
        } else {
            System.out.println("Você não é o rei");
        }
        sc.close();
    }

}
