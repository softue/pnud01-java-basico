import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

        int idade;
        Scanner sc = new Scanner(System.in);
        boolean drivingUnderAge = false;
        
        System.out.print("Qual a sua idade? ");
        idade = sc.nextInt();
        drivingUnderAge = ( idade <= 18 );
        
        System.out.println(drivingUnderAge);
       
        sc.close();
    }
}
